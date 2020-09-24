package courseForschoolBoy;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task33{
    int revers(int n,int s){
        int res=0;
        while (n > 0) {
            int d =n%s;
            n/=s;
            res*=s;
            res+=d;
        }
        return res;
    }
    void solve(Scanner in, PrintWriter out) {
int n= in.nextInt();
int count=0;
int first=1;
for (int s=2;s<=36;s++){
    if (n==revers(n,s)){
        if (count==0){
            first=s;
        }else if (count==1){
            count=2;
            System.out.println("multi");
            System.out.println(first+" "+s);
        }else {
            System.out.println(" "+s);
        }

    }
}




                }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)
        ) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {

        new Task33().run();
    }
}

