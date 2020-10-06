package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task45 {
    void solve (Scanner in, PrintWriter out ){
        int min=0;
        int cur=0;
        int max=0;
for(char c: in.next().toCharArray()){
    if (c=='1'){
        cur++;
    }else if (c=='2'){
        cur--;
    }
    min=Math.min(min,cur);
    max=Math.max(max,cur);
}
        System.out.println(max-min+1);

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
        new Task45().run();
    }
}
