// N���A0����10�܂ő����鎞�AN�̊K����v�Z����B
// 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
// ���[�v��1�����p���č쐬
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        long[] perm = new long[number + 1];
        
        perm[0] = 1; // 0�̊K��̒l��1
        perm[1] = 2; // 2��1���2
        
        for (int i = 0; i <= number; i++) {
            if (i >= 1) {
                perm[i] = perm[i-1] * i; // (�������C��) (i-1)�̊K��̒l����i�̊K��̒l�����߂�
            }
            System.out.println(i + ": " + perm[i]);
        }
    }
}
