package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task36 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        int s = in.nextInt();
        int[]a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int t=0;
        int y=0;
        for(int i=0;i<n;i++) {
if (y+a[i]<=s){
    y+=a[i];
    t++;
}

        }
        System.out.println(t);
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
        new Task36().run();
    }
}
