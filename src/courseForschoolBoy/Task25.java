package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task25 {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                boolean s = true;
                for (int j = i; j < n; j++) {
                    if (s) {
                        s = false;
                    } else
                        System.out.println("");}
                    for (int j = 1; j < n; j++) {
                        if (s) {
                            s = false;
                        } else
                            System.out.println("");
                        System.out.println(a[j]);
                    }


                }
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
        new Task25().run();
    }
}
