package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        int [] arr= new int [n];
        int [] arr2= new int [n];
        int []arr3= new int [n];
        int a=-1;
        int ind=0;
        int j=0;
for (int i=0;i<n;i++) {
    arr[i] = in.nextInt();
}
for (int i=0;i<n;i++) { arr2[i] = in.nextInt();
}
   arr3[0]=arr[0]*arr[0];
    a=arr3[0];
    ind =1;
        for (int i=1;i<n;i++){
            arr3[i]=arr[i]*arr2[i];
            if (arr3[i]>a){
                a=arr3[i];
                ind=i+1;
            }
        }
        System.out.println(ind);
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
        new Task22().run();
    }
}
