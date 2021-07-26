// Hoge, Fuga, Piyo - else if•¶Aelse•¶‚ğ—p‚¢‚È‚¢
public class Main {
    public static void main(String[] args) throws Exception {
        String output;
        for (int i = 1; i <= 100; i++) {
            output = "";
            if (i % 4 == 0) {
                output = "Hoge";
            }
            if (i % 6 == 0) {
                output = output + "Fuga";
            }
            if (i % 4 != 0 && i % 6 != 0) { // i‚ª4‚Å‚à6‚Å‚àŠ„‚èØ‚ê‚È‚¢‚Æ‚«
                output = "Piyo";
            }
            output = String.valueOf(i) + ": " + output;
            System.out.println(output);
        }
    }
}
