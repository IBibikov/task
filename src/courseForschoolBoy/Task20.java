package courseForschoolBoy;


import java.io.PrintWriter;
import java.util.Scanner;

public class Task20 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        int s=0;
        int t=0;
for (int i=0;i<n;i++) {
    int x= in.nextInt();
    if (x == 0) {
        s++;
    } else if (x==1){
        t++;
    }else{
        throw new Error();
    }
}
        System.out.println(Math.min(s,t));
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
        new Task20().run();
    }
}
