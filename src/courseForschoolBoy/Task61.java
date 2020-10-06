package courseForschoolBoy;


import java.io.PrintWriter;
import java.util.Scanner;

public class Task61 {
    boolean isPal(String s) {
        for (int i = 1; i < s.length() - 1 - i; i++) {
            int j = s.length() - 1 - i;
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    boolean onlySame(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    void solve(Scanner in, PrintWriter out) {
        String s = in.next();

            if (onlySame(s)) {
                System.out.println("NO SOLUTION");
                return;
            } else if (isPal(s)) {
                System.out.println(s.substring(1));
            } else
                System.out.println(s);



    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)
        ) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Task61().run();
    }
}
