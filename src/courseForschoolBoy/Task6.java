package courseForschoolBoy;
//Входной файл INPUT.TXT содержит 4 строки, в каждой строке находится два целых числа a и b – итоговый счет в соответствующей четверти.
// а – количество набранных очков за четверть первой командой,
// b – количество очков, набранных за четверть второй командой. (0 ≤ a,b ≤ 100)
import org.w3c.dom.ls.LSOutput;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task6 {
    void solve (Scanner in, PrintWriter out ){
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        int a4 = in.nextInt();
        int b4 = in.nextInt();
        int sum1=a1+a2+a3+a4;
        int sum2=b1+b2+b3+b4;

        if (sum1>sum2){
            System.out.println("1");
        }else if (sum1<sum2){
            System.out.println("2");
        }else System.out.println("DRAW");


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
        new Task6().run();
    }
}


