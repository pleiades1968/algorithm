// Hoge, Fuga, Piyo - else if���Aelse����p���Ȃ�
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
            if (i % 4 != 0 && i % 6 != 0) { // i��4�ł�6�ł�����؂�Ȃ��Ƃ�
                output = "Piyo";
            }
            output = String.valueOf(i) + ": " + output;
            System.out.println(output);
        }
    }
}
