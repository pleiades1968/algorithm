// Fizz�ABuzz�̑���ɁAHoge�AFuga�B100�܂ŏo�͂���B�������Aelse��else if����p���Ȃ����ƁB
public class Main {
    public static void main(String[] args) throws Exception {
        String output;
        for (int i = 1; i <= 100; i++) {
            output = "";
            // 3�̔{���̂Ƃ�
            if (i % 3 == 0) {
                output = "Hoge"; // �������C��
            }
            // 5�̔{���̂Ƃ�
            if (i % 5 == 0) {
                output = output + "Fuga";// �������C��
            }
            // �o�͂��镶����̍����ɔԍ���A��
            output = String.valueOf(i) + ": " + output;
            System.out.println(output);
        }
    }
}
