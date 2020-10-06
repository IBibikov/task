package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task60 {
    int plusMinusSumm(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            int d =s.charAt(i)-'0';
            if (i%2==0){
                sum+=d;
            }else{
                sum-=d;
            }
        }
        return sum;
    }
    void solve (Scanner in, PrintWriter out ){
       String s=in.next();
       char [] arr= s.toCharArray();
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           max= Math.max(max,plusMinusSumm(s.substring(0,i)+s.substring(i+1)));
       }
        System.out.println(max);
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
        new Task60().run();
    }
}
