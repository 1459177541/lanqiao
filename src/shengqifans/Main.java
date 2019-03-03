package shengqifans;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < n; j++) {
            String[] in = sc.nextLine().split(" ");
            int[] ints = new int[in.length - 1];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(in[i + 1]);
            }
            Arrays.sort(ints);
            int d = ints[1] - ints[0];
            boolean flag = false;
            for (int i = 2; i < ints.length; i++) {
                if (d != ints[i] - ints[i - 1]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}
