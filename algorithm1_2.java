// 4�̔{��:Hoge�A6�̔{��:Fuga�A����ȊO:Piyo�B100�܂ŏo�͂���
public class Main {
	public static void main(String[] args) throws Exception {
		String output;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) { // 4�̔{���ł���6�̔{���̂Ƃ�
				output = i + ": HogeFuga";
			} else if (i % 3 == 0) { // 4�̔{���̂Ƃ�
				output = i + ": Hoge";
			} else if (i % 5 == 0) { // 6�̔{���̂Ƃ�
				output = i + ": Fuga";
			} else { // ����ȊO�̂Ƃ�
				output = i + ": Piyo";
			}
			System.out.println(output);
		}
	}
}
