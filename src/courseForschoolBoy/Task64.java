package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task64 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
         for (int step =26;step>=1;step--){
             if (n==1){
                 System.out.println((char)('a'+(step-1 )));
                 return;
             }else if(n<=1<<(step-1)){
                 n--;
             }else{
                 n-=1<<(step-1);
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
        new Task64().run();
    }
}
