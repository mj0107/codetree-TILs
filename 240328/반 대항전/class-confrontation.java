import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st = null;
    private static StringBuilder sb = null;

    private static int n;
    private static char[] classList = { 'A', 'B', 'C', 'D' };
    private static int[] totalScoreList;

    public static void main(String[] args) throws Exception {
        input();
        solve();
        output();
    }

    private static void input() throws Exception {
        n = Integer.parseInt(br.readLine());

        totalScoreList = new int[4];
        for(int i=0; i<4; i++) {
            int sum = 0;
            
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            for(int j=0; j<n; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            totalScoreList[i] = sum;
        }

        br.close();
    }

    private static void solve() throws Exception {
        sb = new StringBuilder();

        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<4; i++) {
            if(totalScoreList[i] > max) {
                max = totalScoreList[i];
                maxIndex = i;
            }

            sb.append(classList[i])
              .append(" - ")
              .append(totalScoreList[i])
              .append('\n');
        }

        sb.append("Class ")
          .append(classList[maxIndex])
          .append(" is winner!");
    }

    private static void output() throws Exception {
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}