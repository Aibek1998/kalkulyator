import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc1.nextLine();
        if (c.equals("+")) {
            methodkoshuu(a, b);
        } else if (c.equals("-")) {
            methodkemituu(a, b);
        } else if (c.equals("/")) {
            methodboluu(a, b);
        } else if (c.equals("*")) {
            methodkoboituu(a, b);
        } else if (c.equals("^")) {
            metyhoddaraja(a, b);
        }
        System.out.println();
    }

    public static void methodkoshuu(int a, int b) {
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
    }

    public static void methodkemituu(int a, int b) {
        int sum = a - b;
        System.out.println(a + "-" + b + "=" + sum);
    }

    public static void methodkoboituu(int a, int b) {
        int sum = a * b;
        System.out.println(a + "*" + b + "=" + sum);
    }

    public static void methodboluu(int a, int b) {
        int sum = a / b;
        System.out.println(a + "/" + b + "=" + sum);
    }

    public static void metyhoddaraja(int a, int b) {
        int sum = (int) Math.pow(a, b);
        System.out.println(a + "^" + b + "=" + sum);
    }
}
