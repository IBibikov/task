package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task29 { void solve (Scanner in, PrintWriter out ){
    int n = in.nextInt();
    int[] arr= new int[n+1];
    for (int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    int k=in.nextInt();
    for (int i=0;i<k;i++){
    int key=in.nextInt();
        arr[key]--;
    }
for (int i=0;i<k;i++){
if (arr[i]<=0){
    System.out.println("yes");
}else System.out.println("no");
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
        new Task29().run();
    }
}
