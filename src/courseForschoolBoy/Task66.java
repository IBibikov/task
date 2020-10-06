package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task66 {
    String meth1(String s,int n){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(s);
        }
        String g=sb.toString();
        return g;
    }


    void solve (Scanner in, PrintWriter out ){



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
        new Task5().run();
    }
}
