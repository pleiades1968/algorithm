// FizzBuzz�����ǂ���
// 1���琮���𐔂���
// 3�Ŋ���؂�� = Fizz
// 5�Ŋ���؂�� = Buzz
// 3�ł�5�ł�����؂�� = FizzBuzz
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
