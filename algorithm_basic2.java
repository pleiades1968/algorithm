// FizzBuzz‚ğ‰ü—Ç‚·‚é
// 1‚©‚ç®”‚ğ”‚¦‚é
// 3‚ÅŠ„‚èØ‚ê‚é = Fizz
// 5‚ÅŠ„‚èØ‚ê‚é = Buzz
// 3‚Å‚à5‚Å‚àŠ„‚èØ‚ê‚é = FizzBuzz
public class Main {
	public static void main(String[] args) throws Exception {
		String output;
		for (int i = 1; i <= 30; i++){
			output = "";
			if(i % 3 == 0) {
				output = "Fizz";
			}
			if(i % 5 == 0) {
				output = output + "Buzz";
			}
			output = String.valueOf(i) + ":" + output;
			System.out.println(output);
		}
	}
}
