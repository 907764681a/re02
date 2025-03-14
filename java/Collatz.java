/**
 * Class that prints the Collatz sequence starting from a given number.
 * @author YOUR NAME HERE
 */
public class Collatz {

    /** Correct implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            // 如果 n 是偶数，下一个数字是 n / 2
            return n / 2;
        } else {
            // 如果 n 是奇数，下一个数字是 3 * n + 1
            return 3 * n + 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}