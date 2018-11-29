package yanjiangdasaipingfeng;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //失败
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[7];
        while (sc.hasNextLine()) {
            String[] in = sc.nextLine().split(" ");
            for (int i = 0; i < 7; i++) {
                score[i] = Integer.parseInt(in[i]);
            }
            Arrays.sort(score);
            double sum = score[1] + score[2] + score[3] + score[4] + score[5];
            System.out.printf("%s %.2f\n", in[7], sum / 5);
        }
    }


}
