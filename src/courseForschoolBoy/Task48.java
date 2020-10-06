package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task48 { void solve (Scanner in, PrintWriter out ){
    String s= in.next();
    int count =0;
    while(s.length()>1){
        int sum=0;
        for(char c : s.toCharArray()){
            sum+=c-'0';
        }
        s=""+sum;
        count++;
        }
    System.out.println(s+" "+count);
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
        new Task48().run();
    }
}
