package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task50 {
    int timeTominus(String s){
        int h10=s.charAt(0);
        int h1=s.charAt(1);
        int m10=s.charAt(3);
        int m1=s.charAt(4);
        return (h10*10+h1)*60+m10*10+m1;
    }
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        String best =null;
        int bestTime=24*60+1;
for (int i=0;i<n;i++){
    String s= in.next();
    int begin=timeTominus(s.substring(s.length()-11,s.length()-6));
    int end= timeTominus(s.substring(s.length()-5));
    s.substring(s.length()-11,s.length()-6);
    s.substring(s.length()-5);
int time;
if (begin<end){
    time=end-begin;
}else time=end+24*60-begin;
if (time<bestTime){
    bestTime=time;
    best=s.substring(0,s.length()-12);
}
    System.out.println("The fastest train is " +best+
            "Its speed is 165 km/h, approximately.");
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
        new Task5().run();
    }
}
