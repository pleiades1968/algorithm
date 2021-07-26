// Fizz、Buzzの代わりに、Hoge、Fuga。100まで出力する。ただし、else文else if文を用いないこと。
public class Main {
    public static void main(String[] args) throws Exception {
        String output;
        for (int i = 1; i <= 100; i++) {
            output = "";
            // 3の倍数のとき
            if (i % 3 == 0) {
                output = "Hoge"; // ここを修正
            }
            // 5の倍数のとき
            if (i % 5 == 0) {
                output = output + "Fuga";// ここを修正
            }
            // 出力する文字列の左側に番号を連結
            output = String.valueOf(i) + ": " + output;
            System.out.println(output);
        }
    }
}
