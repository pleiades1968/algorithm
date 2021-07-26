// FizzBuzz
// 1‚©‚ç®”‚ğ”‚¦‚é
// 3‚ÅŠ„‚èØ‚ê‚é = Fizz
// 5‚ÅŠ„‚èØ‚ê‚é = Buzz
// 3‚Å‚à5‚Å‚àŠ„‚èØ‚ê‚é = FizzBuzz
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