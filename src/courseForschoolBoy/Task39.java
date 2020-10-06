package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task39 {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        StringBuilder b = new StringBuilder("2.7182818284590452353602870");
        if (n == 0) {
            System.out.println("3");
            return;
        }
        char last=b.charAt(n+1);
        char after = b.charAt(n+2);
        if ('5'<= after&& after<='9'){
             last++;
        }
b.setCharAt(n+1,last);
        System.out.println(b.substring(0,n+2));

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
        new Task39().run();
    }
}
