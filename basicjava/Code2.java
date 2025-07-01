public class Code2 {
    public static void countDigits(int n) {
        int cnt = 0;
        int ld;
        while (n > 0) {
            ld = n % 10;
            n = n / 10;
            cnt = cnt + 1;
        }
        // System.out.println(cnt);
        return n;
    }

    public static void main(String[] args) {
        // countDigits(7789);
        int n = 7789;
        countDigits(n);
    }
}
