//�g���{�i�b�`��
// 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 50;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + tribonacci(i));
        }
    }
    // �w��Ԗڂ̃g���{�i�b�`�������߂�
    public static long tribonacci(int num) {
        if (num == 0) { // num��0�Ȃ��0��Ԃ�
            return 0;
        }
        if (num == 1) { // num��1�Ȃ��0��Ԃ�
            return 0;
        }
        if (num == 2) { // num��2�Ȃ��1��Ԃ�
            return 1;
        }
        
        long tri = 0; // ������ۑ�����ϐ�
        long tri_0 = 0; // �O�O�̃g���{�i�b�`����ۑ�����ϐ�
        long tri_1 = 0; // ��O�̃g���{�i�b�`����ۑ�����ϐ�
        long tri_2 = 1; // ��O�̃g���{�i�b�`����ۑ�����ϐ�
        
        for (int i = 3; i <= num; i++) {
            tri = tri_0 + tri_1 + tri_2; // i�Ԗڂ̃g���{�i�b�`�����v�Z����
            tri_0 = tri_1;
            tri_1 = tri_2;
            tri_2 = tri;
        }
        return tri;
    }
}
