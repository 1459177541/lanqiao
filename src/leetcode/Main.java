package leetcode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        // https://leetcode-cn.com/problems/maximum-gap/
        System.out.println(main.maximumGap(new int[]{3, 6, 9, 1}));
        System.out.println(main.maximumGap(new int[]{10}));

        System.out.println("------------------------");

        // https://leetcode-cn.com/problems/insertion-sort-list/
        ListNode listNode = new ListNode(4);
        listNode.next(2).next(1).next(3);
        System.out.println(main.insertionSortList(listNode));
        ListNode listNode2 = new ListNode(-1);
        listNode.next(5).next(3).next(4).next(0);
        System.out.println(main.insertionSortList(listNode2));
    }

    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int d = 0;
        for (int i = 1; i < nums.length; i++) {
            int td = nums[i] - nums[i - 1];
            if (td > d) {
                d = td;
            }
        }
        return d;
    }

    //TODO ERROR
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        head = head.next;
        p.next = null;
        while (head != null) {
            ListNode q = head;
            head = head.next;
            q.next = null;
            if (q.val < p.val) {
                q.next = p;
                p = q;
                continue;
            }
            ListNode t = p;
            while (t.next != null) {
                if (t.next.val < q.val) {
                    break;
                }
                t = t.next;
            }
            q.next = t.next;
            t.next = q;
        }
        return p;
    }

}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
    ListNode next(int x) {
        next = new ListNode(x);
        return next;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(val).append(next != null ? "->" + next.toString() : "").toString();
    }
}
