package courseForschoolBoy;
//В первой строке входного файла INPUT.TXT содержится натуральное число
//N – количество предметов, которые нужно сдать Валере (N ≤ 100). Далее идет N строк,
//каждая из которых состоит из двух чисел A и B, задающих отрезок работы очередного преподавателя (1 ≤ A ≤ B ≤ 31).
import java.io.PrintWriter;
import java.util.Scanner;

public class Task16 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        int minF=in.nextInt();
        int minS=in.nextInt();

        for (int i=1;i<n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            minF = Math.max(minF, a);
            minS = Math.min(minS, b);
        }
        if (minF<=minS){
            System.out.println("YES");
        } else {System.out.println("NO");}


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
        new Task16().run();
    }
}
