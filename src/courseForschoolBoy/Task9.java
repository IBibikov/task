package courseForschoolBoy;
//Секретарь олимпиады на вопрос: "Сколько участников на олимпиаде по информатике?", отвечал подобно Пифагору:
// "K-тая часть участников начала решать первую задачу, M-тая часть – вторую, а N-т" +
//"ая – третью. В то же время D участников решают" +проблему: "
//С чего начать?". Ваша задача определить количество участников олимпиады или вывести -1, если секретарь ошибся.
import java.io.PrintWriter;
import java.util.Scanner;

public class Task9 {
    void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int d = in.nextInt();
        if (k * m * n - m * n - k * n - k * m > 0 && d * k * m * n % (k * m * n - m * n - k * n - k * m) == 0) {
            int x = d * k * m * n / (k * m * n - m * n - k * n - k * m);
            if (x % k == 0 && x % m == 0 && x % n == 0) {
                System.out.println(x);
            } else {
                System.out.println(-1);
            }
        }else System.out.println(-1);

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
        new Task9().run();
    }
}

