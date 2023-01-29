package beakjoon;

import java.io.*;

public class _9020 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] answer = new String[T];
        boolean[] arr = new boolean[10000];

        for (int i = 2; i < arr.length - 1; i++) {
            for (int j = i * i; j < arr.length - 1; j += i) {
                arr[j] = true;
            }
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int a = n / 2;
            int b = n / 2;

            while (true) {
                if (!arr[a] && !arr[b]) {
                    answer[i] = String.format("%d %d", a, b);
                    break;
                }
                a--;
                b++;
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println(answer[i]);
        }
    }
}
