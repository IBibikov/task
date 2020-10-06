package courseForschoolBoy;


import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task56 {
    void solve (Scanner in, PrintWriter out ){
        char[] arr=in.next().toCharArray();
        char[] arr1=in.next().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
      if ( Arrays.equals(arr1,arr)){
          System.out.println("YES");
        } else {
          System.out.println("NO");
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
        new Task56().run();
    }
}
