package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task11 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        int m = in.nextInt();
        int k= in.nextInt();
        if (n>=m){
            System.out.println(1);
        }else if(n>k){
            System.out.println(1+(m-k-1)/(n-k));
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
        new Task11().run();
    }
}
