package courseForschoolBoy;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task41 {
    void solve (Scanner in, PrintWriter out ){
        int pos= 1;
        String input;
        if (in.hasNextLine()){
                input = in.nextLine();
        }else input="";
        for (char c :input.toCharArray()){
            if( c=='A'){
                if (pos ==1){
                    pos=2;
                }else if (pos==2){
                    pos=1;
                }
            }else if(c=='B'){
                if (pos==3){
                    pos =2;
                }else if(pos ==2){
                    pos =3;
                }
            } else if (c == 'C') {
                if (pos==1){
                    pos=3;
                }else if(pos==3){
                    pos =1;}
            }else {
                throw new Error();
            }
        }
        System.out.println(pos);
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
        new Task41().run();
    }
}
