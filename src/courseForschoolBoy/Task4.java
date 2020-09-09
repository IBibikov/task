package courseForschoolBoy;
//В одной из компаний ИТ-града было принято решение создать группу инновационных разработок численностью от 5 до 7 человек и набрать для этого новых сотрудников.
// После размещения объявлений в компанию поступило n анкет. Теперь отделу кадров предстоит непростая задача оценить каждый возможный состав группы и выбрать один из них.
//Ваша задача — посчитать, сколько вариантов состава новой группы необходимо будет рассмотреть отделу кадров.
import java.io.*;
import java.util.Scanner;

public class Task4 {
    void solve (Scanner in, PrintWriter out ){
        int n = in.nextInt();
        long c5=n / 1 * (n - 1) / 2 * (n - 2) / 3 * (n - 3) / 4*(n-4 ) / 5;
        long c6=c5*(n-5)/6;
        long c7=c6*(n-6)/7;
        System.out.println(c5+c6+c7);
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
        new Task4().run();
    }
}


