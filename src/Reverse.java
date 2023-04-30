public class Reverse {
    public static void main(String[] args) {
        // reverse a number
        int n = 23485;
        // ans should be 58432
        int ans = 0;

        while (n > 0) {
            // get the last number by mod by 9
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        System.out.println(ans);

    }
}
