import java.util.Scanner;
public class OptimVes {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи свой вес");
        int ves = sc.nextInt();
        System.out.println("Введи свой рост");
        int rost = sc.nextInt();
        int optVes = rost - 100;
        System.out.println("Ваш оптимальный вес " + optVes + " кг");
        if (ves>optVes)
            System.out.println("Вам необходимо похудеть на " + (ves-optVes) + " кг");
        else if  (ves == optVes)
                System.out.println("У вас идеальный вес");
        else
            System.out.println("Вам необходимо поправиться на " + (optVes-ves) + " кг");
    }
}