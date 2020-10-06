package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task63 {
    void solve (Scanner in, PrintWriter out ){
       String s=in.next();
       String t= in.next();
       for(int i=0;i<s.length();i++){
           for(int j=0;j<t.length();j++){
               if (s.charAt(i) == t.charAt(j)) {
                   System.out.println("YES");
               }else System.out.println("NO");
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
        new Task5().run();
    }
}
