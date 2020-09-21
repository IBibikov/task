package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task21 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        int s =0;
for (int i=1;i<=n;i++){
    if (n%i==0){
        s+=i;
    }
}
        System.out.println(s);

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
        new Task21().run();
    }
}
