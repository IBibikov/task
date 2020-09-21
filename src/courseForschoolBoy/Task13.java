package courseForschoolBoy;
//Однажды известный профессор обнаружил описания k конечных автоматов.
// По его мнению, нетривиальность конечного автомата, имеющего n состояний и m переходов,
// можно описать целым числом d = 19m + (n + 239)*(n + 366) / 2 . Чем больше d, тем больший интерес
//   для науки представляет изучение его свойств.

// Помогите профессору вычислить нетривиальность имеющихся у него автоматов.
import java.io.PrintWriter;
import java.util.Scanner;

public class Task13 {
    void solve (Scanner in, PrintWriter out ){
        int k= in.nextInt();
        for (int i =0;i<k;i++) {
            int n = in.nextInt();
            int m= in.nextInt();
            System.out.println(19*m+(n+239)*(n+366)/2);
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
        new Task13().run();
    }
}

