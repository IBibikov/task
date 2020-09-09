package courseForschoolBoy;
import java.io.PrintWriter;
import java.util.Scanner;
//Найдите количество невырожденных прямоугольников со сторонами,
//параллельными осям координат, вершины которых лежат в точках с целыми координатами внутри или на границе прямоугольника,
//противоположные углы которого находятся в точках (0, 0) и (W, Н)
public class Task1 {

    void solve (Scanner in, PrintWriter out ){
        int x = in.nextInt();
        int y = in.nextInt();

        out.println(x*(x+1)*y*(y+1)/4);
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
        new Task1().run();
    }
}
