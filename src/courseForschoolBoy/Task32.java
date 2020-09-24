package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task32 {
    void solve(Scanner in, PrintWriter out) {
        int[] digits = new int[10001];
        int pos=1;
        for (int i=2;;i++){
            if(true){
                int t= i;
                int pow=1;
                while (pos*10<=t){
                    pow*=10;
                }
                for(;pow>0;pow/=10){
                    int d=i/pow%10;
                }
            }
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
        new Task32().run();
    }
}
