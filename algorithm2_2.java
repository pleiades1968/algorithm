// Hoge, Fuga, Piyo - else if文、else文を用いない
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
            if (i % 4 != 0 && i % 6 != 0) { // iが4でも6でも割り切れないとき
                output = "Piyo";
            }
            output = String.valueOf(i) + ": " + output;
            System.out.println(output);
        }
    }
}
