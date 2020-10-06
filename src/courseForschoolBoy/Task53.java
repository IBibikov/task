package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task53 {
    void solve (Scanner in, PrintWriter out ){
        int count=1;
        for (char c :("aaa" +in.next()+"A").toCharArray()){
            if ('a'<=c && c<='z'){
                count++;
            }else if('A'<=c && c<='Z') {
                if (count < 2 || count > 4) {
                    System.out.println("No");
                    return;
                }
                count = 1;
            }else{
                throw new Error();
            }

        }
        System.out.println("Yes");

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
        new Task53().run();
    }
}
