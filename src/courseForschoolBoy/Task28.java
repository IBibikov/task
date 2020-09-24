package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task28 {
    boolean contains(int n ,int d){
        while (n>0){
            if (n%10==d){
           return true;
            }
            n/=10;
        }
return false;
    }
    boolean areFriendly(int a ,int b ){
        for (int i =0;i<=9;i++){
            if (contains(a,i)!=contains(b,i)){
                return false;
            }
        }
        return true;
    }
    void solve(Scanner in, PrintWriter out) {
     int n = in.nextInt();
     for (int i =0;i<n;i++){
         int a =in.nextInt();
         int b = in.nextInt();
         if (areFriendly(a,b)){
             System.out.println("YES");
         }else System.out.println("NO");
     }

    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)
        ) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Task28().run();
    }
}
