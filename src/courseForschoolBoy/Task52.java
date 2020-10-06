package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task52 {
    void solve (Scanner in, PrintWriter out ){
        int num=0;
        for (char c :in.next().toCharArray()){
            if ('0'<=c && c<='9'){
num=num*10+(c-'0');
            }else if ('A'<=c && c<='Z'){
              if (num==0){
                  num=1;
              }
              for (int i=0;i<num;i++){
                  System.out.println(c);
              }
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
        new Task52().run();
    }
}
