//トリボナッチ数
// 0, 0, 1, 2, 4, 7, 13, 24, 44, 81, 149
// ループを1つだけ用いて作成
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 50;
        long[] tri = new long[number + 1];
        
        tri[0] = 0; // (ここを修正) 0番目のトリボナッチ数は0
        tri[1] = 0; // (ここを修正) 1番目のトリボナッチ数は0
        tri[2] = 1; // (ここを修正) 2番目のトリボナッチ数は1
        
        for (int i = 0; i <= number; i++) {
            if (i >= 3) {
                // 直前の3つのトリボナッチ数から次のトリボナッチ数を求める
                tri[i] = tri[i-1] + tri[i-2] + tri[i-3]; // (ここを修正)
            }
            System.out.println(i + ": " + tri[i]);
        }
    }
}
