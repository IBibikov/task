package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task54 {
    void solve(Scanner in, PrintWriter out) {
        String s = in.next();
        String max = "";
        for (int i = 0; i + 1 < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String cur=s.substring(0,i)+s.substring(i+1,j)+s.substring(j+1);
                if (cur.compareTo(max)>0){
                    max=cur;
                }
            }
        }
        System.out.println(max);
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
        new Task54().run();
    }
}
