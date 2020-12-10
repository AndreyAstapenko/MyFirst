import java.util.Scanner;
public class Comparison {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи первое число");
        int numb1 = sc.nextInt();
        System.out.println("Введи второе число");
        int numb2 = sc.nextInt();
        if (numb1 > numb2)
            System.out.println("Число " + numb1 + "> " + numb2);
        else if (numb1 < numb2)
            System.out.println("Число " + numb1 + "< " + numb2);
        else
            System.out.println("Число " + numb1 + "= " + numb2);
    }
}
