/* Написать программу калькулятор, который умеет
складывать и делить с консольным меню. Выход из
программы осуществляется введением символа q
 */
import java.util.Scanner;
class Сalc {
    public static void main (String args[]) {
        System.out.println("Выберите операцию");
        System.out.println("1 - операция деления");
        System.out.println("2  - операция сложения");
        System.out.println("q - выход");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Выбрана операция сложения");
                System.out.println("Введите 2 числа");
                int numb1 = sc.nextInt();
                int numb2 = sc.nextInt();
                System.out.println(numb1);
                System.out.println(numb2);
            }
            break;
            case 2: {
                System.out.println("Выбрана операция сложения");
                System.out.println("Введите 2 числа");
                int numb1 = sc.nextInt();
                int numb2 = sc.nextInt();
                System.out.println(numb1);
                System.out.println(numb2);
            }
        }

    }
}