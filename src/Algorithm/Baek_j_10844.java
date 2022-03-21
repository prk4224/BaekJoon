package Algorithm;
// 1 2 3 4 5 6 7 8 9, 21010,21012,21210,21212,21232,21234,23210,23212,23232,23234,23432,23434,23454,23456
// 10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98 (17) // 87654,87656,87676,87678,87876,87878,87898,89876,89878,89898
// 101,121,123(3),210,212,232,234(4),321,323,343,345,876,878,898(3),989,987(2) //98765,98767, 98787,98789,98987,98989,
// 9 17 32 1010,1012,1210,1212,1232,1234(6),2101,2121,2123,2321,2323,2343,2345(7),3210,3212,3232,3234,3432,3434,3454,3456(8),9876,9878,9898
//  1  1  1  1  1  1  1  1  1 9
//  2  2  2  2  2  2  2  2  1 17 (9*2-1)
//  3  4  4  4  4  4  4  3  2 32 (9*4-4) 3
//  6  7  8  8  8  8  7  6  3 61 (9*8-11) 7
// 12 14 15 16 16 16 16 10  5 116 (9*16-28) 17
// 24 28 30 31 32 32 32 16  8
// 48 56 60 62 63 64 52 26 13
import java.io.*;

public class Baek_j_10844 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        long dp[] = new long[N+1];
        dp[1] =9;
        int num = 0;
        int num_2 =1;

        for(int i = 2; i <=N; i++){
            int plus = num + num_2;
            dp[i] = (dp[1]* (long)Math.pow(2,i-1)) - plus;
            num = plus;
            num_2 = num_2 + (2*(i-1));
        }

        bw.write(dp[N]+"");
        bw.flush();
        bw.close();
    }
}
