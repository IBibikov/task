package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task31 {
    boolean isGood(int n){
        boolean wasDigits[]=new boolean[10];
        while(n>0){
            wasDigits[n%10]=true;
            n/=10;
        }
        int count=0;
        for(int i=0;i<9;i++){
            if (wasDigits[i] ){
                count++;
            }
        }
        return count<=2;
    }
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        for (int d=0;d<5;d++){
            if (isGood(n-d)){
                System.out.println( n-d);
                return;
            }
            if (isGood(n+d)){
                System.out.println(n+d);
                return;
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
        new Task31().run();
    }
}
