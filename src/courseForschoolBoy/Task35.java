package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task35 {
    void solve (Scanner in, PrintWriter out ){
        int[] t= new int [in.nextInt()];
        for (int i=0;i<t.length;i++){
            int h= in.nextInt();
            int m= in.nextInt();
            int s= in.nextInt();
            t[i]=h*60*60+m*60+s;
}
        Arrays.sort(t);
        for(int i=0;i<t.length;i++){
            int h=t[i]/3600;
            int m=t[i]/60%60;
            int s=t[i]%60;
            System.out.println(h+" "+m+" "+s);
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
        new Task35().run();
    }
}
