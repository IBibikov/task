package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task49 {

    void solve (Scanner in, PrintWriter out ){
        String x= in.next();
        String y=in.next();
        char[] arr =x.toLowerCase().toCharArray();
        char[] arr2= y.toLowerCase().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if (Arrays.equals(arr,arr2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
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
        new Task49().run();
    }
}
