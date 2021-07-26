// FizzABuzz‚Ì‘ã‚í‚è‚ÉAHogeAFugaB100‚Ü‚Åo—Í‚·‚é
public class Main {
	public static void main(String[] args) throws Exception {
		String output;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) { // 3‚Ì”{”‚Å‚©‚Â5‚Ì”{”‚Ì‚Æ‚«
				output = i + ": "; // ‚±‚±‚ğC³
			} else if (i % 3 == 0) { // 3‚Ì”{”‚Ì‚Æ‚«
				output = i + ": "; // ‚±‚±‚ğC³
			} else if (i % 5 == 0) { // 5‚Ì”{”‚Ì‚Æ‚«
				output = i + ": "; // ‚±‚±‚ğC³
			} else { // ã‚Ì‚·‚×‚Ä‚ÌğŒ‚ğ–‚½‚³‚È‚©‚Á‚½‚Æ‚«
				output = String.valueOf(i);
			}
			System.out.println(output);
		}
	}
}
