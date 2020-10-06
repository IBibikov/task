package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task43 {
    boolean isLetter(char c) {
        return "ABCEHKMOPTXY".indexOf(c) >= 0;
    }

    boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    void solveOne(Scanner in, PrintWriter out) {
        String s = in.nextLine();
        if (s.length() == 6 && isLetter(s.charAt(0)) && isDigit(s.charAt(1)) && isDigit(s.charAt(2)) && isDigit(s.charAt(3)) && isLetter(s.charAt(4)) && isLetter(s.charAt(5))) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            solveOne(in, out);
        }


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
        new Task43().run();
    }
}
