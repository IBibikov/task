package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task40 {
    void solve (Scanner in, PrintWriter out ){
        String k= "qwertyuiopasdfghjklzxcvbnmq";
String old = in.next();
int pos= k.indexOf(old);
        System.out.println(k.charAt(pos+1));

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
        new Task40().run();
    }
}
