// N���A0����10�܂ő����鎞�A2��N����v�Z����BMath.pow�͎g��Ȃ�
// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + power(i));
        }
    }
    // 2��num������߂�
    public static int power(int num) {
        int pow = 1;
        for (int i = 1; i <= num; i++) {
            pow = pow * 2; // pow�̒l��2�{����
        }
        return pow;
    }
}
