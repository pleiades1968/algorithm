// 4‚Ì”{”:HogeA6‚Ì”{”:FugaA‚»‚êˆÈŠO:PiyoB100‚Ü‚Åo—Í‚·‚é
public class Main {
	public static void main(String[] args) throws Exception {
		String output;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) { // 4‚Ì”{”‚Å‚©‚Â6‚Ì”{”‚Ì‚Æ‚«
				output = i + ": HogeFuga";
			} else if (i % 3 == 0) { // 4‚Ì”{”‚Ì‚Æ‚«
				output = i + ": Hoge";
			} else if (i % 5 == 0) { // 6‚Ì”{”‚Ì‚Æ‚«
				output = i + ": Fuga";
			} else { // ‚»‚êˆÈŠO‚Ì‚Æ‚«
				output = i + ": Piyo";
			}
			System.out.println(output);
		}
	}
}
