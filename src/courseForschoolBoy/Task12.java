package courseForschoolBoy;
//Заданы координаты трех вершин прямоугольника. Необходимо определить координаты четвертой вершины.
import java.io.PrintWriter;
import java.util.Scanner;

public class Task12 {
    void solve (Scanner in, PrintWriter out ){
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
int d12=(x1-x2)*(x1-x2)+(y1-y2);
int d13=(x1-x3)*(x1-x3)+(y1-y3);
int d23=(x2-x3)*(x2-x3)+(y2-y3);
if (d12 == d13+d23 ){
    int x4=x1+x2-x3;
    int y4=y1+y2-y3;
    System.out.println(x4 +""+y4);
}else if (d13==d12+d23){
    int x4=x1+x2-x2;
    int y4=y1+y2-y2;
}
else if (d23==d12+d13){
    int x4=x2+x3-x1;
    int y4=y2+y3-y1;
    System.out.println(x4+""+y4);
}else {
    throw new Error();
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
        new Task12().run();
    }
}
