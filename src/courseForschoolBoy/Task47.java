package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;
public class Task47 {

        void solve (Scanner in, PrintWriter out ){
            String n= in.next();
            System.out.println('1');
            for(int i=n.length()-1;i>=0;i-- ){
                if (n.charAt(i)=='0'){
                    System.out.println('0');
                }else break;
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
            new Task47().run();

    }
}