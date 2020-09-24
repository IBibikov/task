package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task34 {
    void solve (Scanner in, PrintWriter out ){
        int [] arr= new int [in.nextInt()];
        int max=0;
        int sum=0;
        for (int i= arr.length-1;i>=0;i--){
            max= Math.max(max,arr[i]);
            sum+=max;
        }
        System.out.println(sum);


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
        new Task34().run();
    }
}
