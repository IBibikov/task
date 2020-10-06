package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task59 {
    void solve (Scanner in, PrintWriter out ){
     String s= in.nextLine();
     int n=in.nextInt();
     for (int i=2;i<=36;i++){
         if (Integer.toString(n,i).toUpperCase().compareTo(s)==0){
             System.out.println(i);
             return;
         }
     }
        System.out.println(0);


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
        new Task59().run();
    }

}
