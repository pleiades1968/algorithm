// Fizz�ABuzz�̑���ɁAHoge�AFuga�B100�܂ŏo�͂���
public class Main {
	public static void main(String[] args) throws Exception {
		String output;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) { // 3�̔{���ł���5�̔{���̂Ƃ�
				output = i + ": "; // �������C��
			} else if (i % 3 == 0) { // 3�̔{���̂Ƃ�
				output = i + ": "; // �������C��
			} else if (i % 5 == 0) { // 5�̔{���̂Ƃ�
				output = i + ": "; // �������C��
			} else { // ��̂��ׂĂ̏����𖞂����Ȃ������Ƃ�
				output = String.valueOf(i);
			}
			System.out.println(output);
		}
	}
}
