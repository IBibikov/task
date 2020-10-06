package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task42 {
    void solve (Scanner in, PrintWriter out ){
     int count=0;
     for(char c:in.next().toCharArray()){
         if (c=='8'){
             count+=2;
         }else if (c=='9'){
             count++;
         }else if (c=='0'){
             count++;
         }else if(c=='6'){
             count++;
         }
     }
        System.out.println(count);
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
        new Task42().run();
    }
}
