package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task62 {
    void solve(Scanner in, PrintWriter out) {
       char[] a= in.next().toCharArray();

        boolean[] wasNum =new boolean[1000];
        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    wasNum[(a[i]-'0')*100+(a[j]-'0')*10+(a[k]-'0')]=true;
                }
            }
        }
        int count =0;
        for(int i=100;i<1000;i++){
            if (wasNum[i]){
                count++;
            }
        }
        System.out.println(count);

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
        new Task62().run();
    }
}
