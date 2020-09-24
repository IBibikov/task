package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task30 {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] count = new int[1 + n];
        int n2= in.nextInt();
for (int i=0;i<2*n2;i++){
    int v=in.nextInt();
    count[v]++;
}
for (int i=0;i<=n2;i++){
    if(i>1){
        System.out.println(" ");
    }
    System.out.println(count[i]);
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
        new Task30().run();
    }
}
