public class CaesarCipher {
    private static String Text ="������ ����!\n" + "��� � ���� � ���������� � �������Ԩ���.\n" + "������� ��� �� ���, ������� ������ �����.\n" + "������Ǩ � ������� � ������˨ ������ ����� �����Ǩ �������. ����.\n";
    public static void main(String args[]) {
        Decoding decod = new Decoding();
        System.out.print("�����:\n" + Text);
        String[] text = Text.split("\n");
        System.out.println(decod.decode(-4, text[0])); // 1 ������
        System.out.println(decod.decode(8, text[1])); // 2 ������
        for (int i = 1; i < 32; i++) {    // 3 ������
            System.out.println(" " + decod.decode(i, text[2]));
        }
        String[] words = text[3].split(" ");
        for (int j = 0; j<words.length; j++) {   // 4 ������
            System.out.println(j+1);
            for (int i = 1; i <= 33; i++) {
                System.out.print(" " + decod.decode(i, words[j]) + "\n");
            }
            System.out.println();
        }
    }
}
