package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task7 {
    void solve (Scanner in, PrintWriter out ){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        if ((a*b)==n) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }



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
        new Task7().run();
    }
}


