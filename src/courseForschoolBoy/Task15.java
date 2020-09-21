package courseForschoolBoy;
//ТТребуется написать программу, которая определяет, является ли заданное число числом Фибоначчи.
import java.io.PrintWriter;
import java.util.Scanner;

public class Task15 {
    void solve (Scanner in, PrintWriter out ) {
    int n = in.nextInt();
    int prev=1;
    int cur=1;
    int pos=2;
while (cur<n){
    int next=prev+cur;
    prev=cur;
    cur=next;
    pos++;
}
if (cur==n){
    System.out.println(1);
    System.out.println(pos);

}else{
    System.out.println(0);
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
        new Task15().run();
    }
}
