package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task46 { void solve (Scanner in, PrintWriter out ){
    int count=0;
    String s;
    if (in.hasNextLine()){
        s=in.next();
    }else s="";
for (int i=0;i+5<s.length();i++){
    String sub= s.substring(i,i+5);
    if(sub.compareTo(">>-->")==0 || sub.compareTo("<--<<")==0){
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
        new Task46().run();
    }
}
