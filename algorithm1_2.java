// 4の倍数:Hoge、6の倍数:Fuga、それ以外:Piyo。100まで出力する
public class Main {
	public static void main(String[] args) throws Exception {
		String output;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) { // 4の倍数でかつ6の倍数のとき
				output = i + ": HogeFuga";
			} else if (i % 3 == 0) { // 4の倍数のとき
				output = i + ": Hoge";
			} else if (i % 5 == 0) { // 6の倍数のとき
				output = i + ": Fuga";
			} else { // それ以外のとき
				output = i + ": Piyo";
			}
			System.out.println(output);
		}
	}
}
