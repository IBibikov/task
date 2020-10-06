package courseForschoolBoy;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task57 {
    void solve(Scanner in, PrintWriter out) {
      String s=in.next();
      String s2=in.next();
      char[] a=s.toCharArray();
      char[] a2=s2.toCharArray();
        int cows = 0;
        int temp = 0;
        int cows2 = 0;
        for (int i = 0; i < 4; i++) {
            if (a[i] == a2[i]) {
                cows++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i] == a2[j]) {
                    cows2++;
                }
            }

        }
        int res = cows2 - cows;
        System.out.println(cows + " " + res);
    }
        void run(){
            try (
                    Scanner in = new Scanner(System.in);
                    PrintWriter out= new PrintWriter(System.out)
            ){
                solve(in,out);
            }
        }

        public static void main(String[] args) {
            new Task57().run();
        }
    }
