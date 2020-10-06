package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task65 {
    void solve(Scanner in, PrintWriter out) {
        String pos1 = in.next();
        String pos2 = in.next();
        char letter1 = pos1.charAt(0);
        char digit1 = pos1.charAt(1);
        char letter2 = pos2.charAt(0);
        char digit2 = pos2.charAt(1);
        if (((letter1 - letter2) * (letter1 - letter2) + (digit1 + digit2) * (digit1 + digit2)) == 5) {
            System.out.println(1);
            return;
        }

        for (char letter = 'a'; letter <= 'h'; letter++) {
            for (char digit = '1'; digit <= '8'; digit++) {
                if ((((letter1 - letter) * (letter1 - letter) + (digit1 + digit) * (digit1 + digit)) == 5) &&
                        (((letter2 - letter) * (letter2 - letter) + (digit2 + digit) * (digit2 + digit)) == 5)) {
                    System.out.println(2);
                    return;
                }
            }

        }
        System.out.println("NO");

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
        new Task65().run();
    }
}
