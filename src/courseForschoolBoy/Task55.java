package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task55 {
    void solve (Scanner in, PrintWriter out ){
        String s= in.next();
       char[] arr=s.toCharArray();
       if (arr[1]=='-'){
           if (arr[0]=='x'){
int a =arr[2]-'0';
int b=arr[4]-'0';
               System.out.println(b+a);

           }else if(arr[2]=='x'){
               int a =arr[0]-'0';
               int b=arr[4]-'0';
               System.out.println(a-b);

           }else if(arr[4]=='x'){
               int a =arr[0]-'0';
               int b=arr[2]-'0';
               System.out.println(a-b);
           }

       }else if (arr[1]=='+')
           if (arr[0]=='x'){
               int a =arr[2]-'0';
               int b=arr[4]-'0';
               System.out.println(b-a);
           }else if(arr[2]=='x'){
               int a =arr[0]-'0';
               int b=arr[4]-'0';
               System.out.println(b-a);

           }else if(arr[4]=='x'){
               int a =arr[0]-'0';
               int b=arr[2]-'0';
               System.out.println(a+b);
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
        new Task55().run();
    }
}
