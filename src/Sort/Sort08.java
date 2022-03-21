package Sort;

import java.util.*;

public class Sort08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        String arr[] = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.next();
        }

        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); // 문자열 배열 오름차순 정렬
        Arrays.sort(arr, new Comparator<String>() { // 문자열 length 오름차순 정렬
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        ArrayList<String> resultArr = new ArrayList<>();

        for (String item : arr) {
            if (!resultArr.contains(item)) {
                resultArr.add(item);
            }
        }

        StringTokenizer st = new StringTokenizer(String.valueOf(resultArr), ",[] ", false);
        int cut = 1;

        while (st.hasMoreElements()) {
            if(cut == resultArr.size()){
                sb.append(st.nextToken());
            }
            else {
                sb.append(st.nextToken()).append('\n');
                cut++;
            }
        }

        System.out.print(sb);
    }
}