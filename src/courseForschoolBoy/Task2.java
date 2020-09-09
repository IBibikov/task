package courseForschoolBoy;
//Зная, что вы любите интересные задачки, и хотите стать программистами, Света попросила вас написать программу,
// которая определяет количество различных салатов для произвольного числа ингредиентов.
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {

    void solve (Scanner in, PrintWriter out ){
        long x = in.nextLong();
        System.out.println(Math.pow(2,x)-1-x);
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
        new Task2().run();
    }
}

