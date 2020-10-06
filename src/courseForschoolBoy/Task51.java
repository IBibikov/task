package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task51 { void solve (Scanner in, PrintWriter out ){
   String s=in.next()+":";
   String s2=in.next()+":";
   String res="";
  while (s.length()>1 || s2.length()>2){
      if (s.compareTo(s2)<0){
          res+=s.charAt(0);
          s=s.substring(1);
      }else {
          res += s2.charAt(0);
          s2= s2.substring(1);
      }
    }
    System.out.println(res);
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
        new Task51().run();
    }
}
