package courseForschoolBoy;
//Требуется написать программу, определяющую наименьшее общее кратное (НОК) чисел a и b.
import java.io.PrintWriter;
import java.util.Scanner;

public class Task18 {
    void solve (Scanner in, PrintWriter out ){
        int a = in.nextInt();
        int b=in.nextInt();
        int p=a*b;
        while (b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        System.out.println(p/a);


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
        new Task18().run();
    }
}

