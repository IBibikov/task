package courseForschoolBoy;

//Иван Васильевич пришел на рынок и решил купить два арбуза: один для себя, а другой для тещи.
//Понятно, что для себя нужно выбрать арбуз потяжелей, а для тещи полегче.
//Но вот незадача: арбузов слишком много и он не знает как же выбрать самый легкий и самый тяжелый арбуз? Помогите ему!
import java.io.PrintWriter;
import java.util.Scanner;

public class Task14 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        int a=in.nextInt();
        int min=a;
        int max=a;
       for(int i=1;i<n;i++){
           int k = in.nextInt();
           min=Math.min(min,k);
           max= Math.max(max,k);
}
        System.out.println(min+" "+max);
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
        new Task14().run();
    }
}

