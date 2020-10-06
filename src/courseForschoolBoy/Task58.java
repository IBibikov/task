package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task58 {
    void solve(Scanner in, PrintWriter out) {
        String s;
        if (in.hasNextLine()) {
            s = in.nextLine();
        } else {
            s = "";
        }
        char max = '0';
        boolean war = false;
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9' || 'A' <= c && c <= 'Z') {
                if (c > max) {
                    max = c;
                }
                war = true;
            } else {
                System.out.println("-1");
                return;
            }
        }
        if (!war) {
            {
                System.out.println("-1");
                return;
            }
        }
        int base;
        if (max == '0') {
            base = 2;
        } else if ('0' <= max && max <= '9') {
            base = max - '0' + 1;
        } else if ('A' <= max && max <= 'Z') {
            base = max - 'A' + 10 + 1;
        } else throw new Error();
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
        new Task58().run();
    }
}
