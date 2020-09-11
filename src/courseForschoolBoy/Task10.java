package courseForschoolBoy;
//Даны длины трех отрезков. Требуется проверить: могут ли они являться сторонами невырожденного треугольника.
import java.io.PrintWriter;
import java.util.Scanner;


public class Task10 {  void solve (Scanner in, PrintWriter out ){
    int a = in.nextInt();
    int b= in.nextInt();
    int c= in.nextInt();
 int sum=a+b;
 int sum2=a+c;
 int sum3=b+c;
 if(sum>c && sum2>b && sum3>a){
     System.out.println("YES");
 }else System.out.println("NO");
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
        new Task10().run();
    }
}

