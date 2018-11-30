package erchashu;

import java.util.Scanner;

public class Main {

    //失败
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            sc.nextLine();
            Tree tree = Tree.init(sc.nextLine().split(" "));
            Tree.first(tree);
            System.out.println();
            Tree.mid(tree);
            System.out.println();
            Tree.last(tree);
            System.out.println();
        }
    }

    static class Tree{
        int date;

        Tree parent = null;
        Tree left = null;
        Tree right = null;

        Tree(int number) {
            date = number;
        }

        static Tree init(String[] numbers) {
            Tree root = new Tree(Integer.parseInt(numbers[0]));
            for (int i = 1; i < numbers.length; i++) {
                Tree c = new Tree(Integer.parseInt(numbers[i]));
                add(root, c);
            }
            return root;
        }

        static void add(Tree parent, Tree c) {
            if (parent.date > c.date) {
                if (parent.left == null) {
                    c.parent = parent;
                    parent.left = c;
                } else {
                    add(parent.left, c);
                }
            }else if(parent.date < c.date){
                if (parent.right == null) {
                    c.parent = parent;
                    parent.right = c;
                } else {
                    add(parent.right, c);
                }
            }
        }

        static void first(Tree root) {
            if (root == null) {
                return;
            }
            System.out.print(root.date + " ");
            first(root.left);
            first(root.right);
        }

        static void mid(Tree root) {
            if (root == null) {
                return;
            }
            mid(root.left);
            System.out.print(root.date+" ");
            mid(root.right);
        }

        static void last(Tree root) {
            if (root == null) {
                return;
            }
            last(root.left);
            last(root.right);
            System.out.print(root.date+" ");
        }
    }
}
