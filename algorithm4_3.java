//�g���{�i�b�`��
// 0, 0, 1, 2, 4, 7, 13, 24, 44, 81, 149
// ���[�v��1�����p���č쐬
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 50;
        long[] tri = new long[number + 1];
        
        tri[0] = 0; // (�������C��) 0�Ԗڂ̃g���{�i�b�`����0
        tri[1] = 0; // (�������C��) 1�Ԗڂ̃g���{�i�b�`����0
        tri[2] = 1; // (�������C��) 2�Ԗڂ̃g���{�i�b�`����1
        
        for (int i = 0; i <= number; i++) {
            if (i >= 3) {
                // ���O��3�̃g���{�i�b�`�����玟�̃g���{�i�b�`�������߂�
                tri[i] = tri[i-1] + tri[i-2] + tri[i-3]; // (�������C��)
            }
            System.out.println(i + ": " + tri[i]);
        }
    }
}
