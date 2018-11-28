package zongshu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    private static Map<Integer, Integer> map = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int in = 0;
        for (int i = 0; i < count; i++) {
            in = sc.nextInt();
            map.put(in, get(in) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (get(in) < entry.getValue()) {
                in = entry.getKey();
            }
        }

        System.out.println(in);
        System.out.println(get(in));
    }

    public static int get(int i) {
        return map.containsKey(i) ? map.get(i) : 0;
    }
}
