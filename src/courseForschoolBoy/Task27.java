package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Task27 {
    void solve (Scanner in, PrintWriter out ){
        int a = in.nextInt();
        Set<Integer> hashSet =new HashSet<Integer>();
       for (int i=0;i<a;i++){
           hashSet.add(in.nextInt());
       }
        Iterator<Integer> i=hashSet.iterator();
       int tt=0;
     while (i.hasNext()){
         tt=tt +i.next();
     }
        System.out.println(tt);


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
        new Task27().run();
    }
}
