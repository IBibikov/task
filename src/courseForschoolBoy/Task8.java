package courseForschoolBoy;
//На свой день рождения Петя купил красивый и вкусный торт, который имел идеально круглую форму.
//Петя не знал, сколько гостей придет на его день рождения, поэтому вынужден был разработать алгоритм,
//согласно которому он сможет быстро разрезать торт на N равных частей.
// Следует учесть, что разрезы торта можно производить как по радиусу, так и по диаметру.
import java.io.PrintWriter;
import java.util.Scanner;

public class Task8 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
if (n==1){
    System.out.println(0);
}
      else  if(n%2==0){
    System.out.println(n/2);
}else {
    System.out.println(n);
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
        new Task8().run();
    }
}

