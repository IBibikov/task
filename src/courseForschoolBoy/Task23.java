package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.*;

public class Task23 {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = a.length-1; i >=0; i--) {
            System.out.println(""+a[i]);
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
        new Task23().run();
    }
}
