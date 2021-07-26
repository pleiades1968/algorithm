// Fizz、Buzzの代わりに、Hoge、Fuga。100まで出力する
public class Main {
	public static void main(String[] args) throws Exception {
		String output;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) { // 3の倍数でかつ5の倍数のとき
				output = i + ": "; // ここを修正
			} else if (i % 3 == 0) { // 3の倍数のとき
				output = i + ": "; // ここを修正
			} else if (i % 5 == 0) { // 5の倍数のとき
				output = i + ": "; // ここを修正
			} else { // 上のすべての条件を満たさなかったとき
				output = String.valueOf(i);
			}
			System.out.println(output);
		}
	}
}
