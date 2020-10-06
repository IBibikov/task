package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task44 { void solve (Scanner in, PrintWriter out ){

    String s;
    if (in.hasNextLine()){
        s=in.nextLine();
    }else{
        s="";
    }
    int max=0;
    int cur=0;
    for(char c :s.toCharArray()){
        if (c=='0'){
            cur++;
            max=Math.max(max,cur);
        }else if (c=='1'){
            cur=0;
        }else{
            throw new Error();

        }
    }

    System.out.println(max);
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
        new Task44().run();
    }
}
