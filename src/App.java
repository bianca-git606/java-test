import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // get the nth fibonacci number
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n - 2; i++) {
            b = a + b;
            a = b;
        }
        System.out.println(b);

        // fib_num = 1;
        // 0, 1, 1, 2, 3, 5, 8
    }
}
