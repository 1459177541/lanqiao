package shulieyouxu;

import java.util.Scanner;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in;
        while (!"0 0".equals((in = sc.nextLine()))) {
            String[] ins = in.split(" ");
            String[] arr = sc.nextLine().split(" ");
            int insert = Integer.parseInt(ins[1]);
            int[] out = new int[arr.length + 1];
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                int a = Integer.parseInt(arr[i]);
                if (a < insert || flag) {
                    if (flag) {
                        out[i + 1] = a;
                    } else {
                        out[i] = a;
                    }
                    if (i == arr.length - 1 && !flag) {
                        out[arr.length] = insert;
                    }
                }else {
                    out[i] = insert;
                    out[i + 1] = a;
                    flag = true;
                }
            }
            for (int i = 0; i < out.length-1; i++) {
                System.out.print(out[i] + " ");
            }
            System.out.println(out[out.length - 1]);
        }

    }
}
