package dumuqiao;

import java.util.Scanner;

public class Main {

    //失败
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.nextLine());
        String[] in = sc.nextLine().split(" ");
        int min = Integer.parseInt(in[0]);
        int max = Integer.parseInt(in[1]);
        int l = max - min + 1;
        int M = Integer.parseInt(in[2]);
        boolean[] next = new boolean[l];
        int p = 0;
        int count = 0;
        int in1 = sc.nextInt();
        while (p <= L && M > 0) {
            if (p + max < in1) {
                p += max;
                continue;
            }
            for (int i = 0; i < l; i++) {
                if (p + i + min == in1) {
                    next[i] = true;
                    if (M > 1) {
                        M--;
                        in1 = sc.nextInt();
                    }
                } else {
                    next[i] = false;
                }
            }
            int t = -1;
            for (int i = 0; i < l; i++) {
                if (!next[l - i - 1]) {
                    t = i;
                    break;
                }
            }
            if (t == -1) {
                count++;
                p += max;
            } else {
                p += t + min;
            }
        }
        System.out.println(count);
    }
}
