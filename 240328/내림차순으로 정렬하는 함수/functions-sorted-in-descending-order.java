import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st = null;
    private static StringBuilder sb = null;

    private static int n;
    private static Integer[] numberList;

    public static void main(String[] args) throws Exception {
        input();
        solve();
        output();
    }

    private static void input() throws Exception {
        n = Integer.parseInt(br.readLine());

        numberList = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            numberList[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    private static void solve() throws Exception {
        Arrays.sort(numberList, Collections.reverseOrder());
    }

    private static void output() throws Exception {
        sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            sb.append(numberList[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}