// FizzBuzz
// 1���琮���𐔂���
// 3�Ŋ���؂�� = Fizz
// 5�Ŋ���؂�� = Buzz
// 3�ł�5�ł�����؂�� = FizzBuzz
public class Main {
    public static void main(String[] args) throws Exception {
        String output;
        for (int i = 1; i <= 30; i++){
            if(i % 3 == 0 && i % 5 == 0){
                output = i + " :FizzBuzz";
            } else if(i % 3 == 0){
                output = i + " :Fizz";
            } else if(i % 5 == 0){
                output = i + " :Buzz";
            } else {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }
}