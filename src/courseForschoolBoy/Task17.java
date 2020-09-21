package courseForschoolBoy;
//Требуется найти последнюю цифру n-го числа Фибоначчи.
import java.io.PrintWriter;
import java.util.Scanner;

public class Task17 { void solve (Scanner in, PrintWriter out ){
    int n = in.nextInt();

    int prev=1;
    int cur=1;
    int s=0;
    for (int i=0;i<n;i++){
int next=(prev+cur)%10;
        prev=cur;
        cur=next;
    }
    System.out.println(prev);

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
        new Task17().run();
    }
}

