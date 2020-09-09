package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {

    void solve (Scanner in, PrintWriter out ){
      int x = in.nextInt();
        System.out.println(3L<<(x-1));

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
        new Task3().run();
    }
}

