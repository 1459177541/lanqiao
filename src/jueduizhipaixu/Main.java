package jueduizhipaixu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    //失败
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int size = sc.nextInt();
            if (0 == size) {
                break;
            }
            Integer[] in = new Integer[size];
            for (int i = 0; i < size; i++) {
                in[i] = sc.nextInt();
            }
            Arrays.sort(in, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    int i = o1 > 0 ? o1 : -o1;
                    int j = o2 > 0 ? o2 : -o2;
                    return j - i;
                }
            });
            for (int i = 0; i < in.length-1; i++) {
                System.out.print(in[i] + " ");
            }
            System.out.println(in[in.length-1]);
        }
    }
}
