// N���A0����10�܂ő����鎞�A2��N����v�Z����BMath.pow�͎g��Ȃ�
// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
// ���[�v��1�����p���č쐬
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        long[] pow = new long[number + 1];
        
        pow[0] = 1; // 2��0���1
        pow[1] = 2; // 2��1���2
        
        for (int i = 0; i <= number; i++) {
            if (i >= 1) {
                pow[i] = pow[i-1] * 2; // (�������C��) 2��(i-1)�悩��2��i��̒l�����߂�
            }
            System.out.println(i + ": " + pow[i]);
        }
    }
}
