import java.util.Scanner;
public class QuotientOfDivision {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи первое число");
        int numb1 = sc.nextInt();
        System.out.println("Введи второе число");
        int numb2 = sc.nextInt();
        double c = (double)numb1/numb2;
        System.out.println(c);

    }
}
