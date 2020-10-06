package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task37 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        int [][]a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }

        }
        int arr=Integer.MAX_VALUE;
        for (int i =0;i<n;i++){
            for (int j =i+1;j<n;j++){
                for (int k =j+1;k<n;k++){
arr= Math.min(arr,a[i][j]+a[i][k]+a[j][k]);

                }

            }
        }
        System.out.println(arr);

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
        new Task37().run();
    }
}
