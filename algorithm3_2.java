// N‚ªA0‚©‚ç10‚Ü‚Å‘‚¦‚éAN‚ÌŠKæ‚ğŒvZ‚·‚éB
// 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + permutation(i));
        }
    }
    // 2‚Ìnumæ‚ğ‹‚ß‚é
    public static int permutation(int num) {
        int perm = 1;
        for (int i = 1 ; i <= num; i++) {
            perm = perm * i; // perm‚ği”{‚·‚é
        }
        return perm;
    }
}
