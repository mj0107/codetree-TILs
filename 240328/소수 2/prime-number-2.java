import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static int n;
    private static boolean[] isPrime;

    private static int result;

    public static void main(String[] args) {
        input();
        solve();
        output();
    }

    private static void input() {
        n = sc.nextInt();

        isPrime = new boolean[n + 1];
    }

    private static void solve() {
        isPrime[1] = false;
        isPrime[2] = true;
        isPrime[3] = true;

        for(int i=2; i<=n; i++) {
            if(isPrime[i] == true) {
                for(int j=i*2; j*j<=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        for(int i=n; i>=0; i--) {
            if(isPrime[i] == true) {
                result++;
            }
        }
    }

    private static void output() {
        System.out.println(result);
    }
}