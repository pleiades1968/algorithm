// Nが、0から10まで増える時、2のN乗を計算する。Math.powは使わない
// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + power(i));
        }
    }
    // 2のnum乗を求める
    public static int power(int num) {
        int pow = 1;
        for (int i = 1; i <= num; i++) {
            pow = pow * 2; // powの値を2倍する
        }
        return pow;
    }
}
