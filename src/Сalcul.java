/* Написать программу калькулятор, который умеет
складывать и делить с консольным меню. Выход из
программы осуществляется введением символа q
 */
import java.util.Scanner;
class Calcul {
    public static void main(String args[])
            throws java.io.IOException {
        char choice, ignore;
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            do {
                System.out.println("Выберите операцию");
                System.out.println("1 - операция сложения");
                System.out.println("2 - операция деления");
                System.out.println("q - выход");

                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            }
            while (choice < '1' | choice > '3' & choice != 'q');
            if (choice == 'q')
                break;
            switch (choice) {
                case '1': {
                    System.out.println("Выбрана операция сложения");
                    System.out.println("Введите 2 числа");
                    int numb1 = sc.nextInt();
                    int numb2 = sc.nextInt();
                    int summ = (numb1 + numb2);
                    if (numb1 >= 0 & numb2 >= 0) {
                        int prov = (Math.abs(summ) - numb1 - numb2);
                        System.out.println(prov);
                        if (prov == 0)
                            System.out.println("Результат сложения числа " + numb1 + " и числа " + numb2 + " = " + summ);
                        else
                            System.out.println("Произошло переполнение");

                    }
                    if (numb2 <= 0 & numb1 <= 0) {
                        int prov = (Math.abs(summ) + numb1 + numb2);
                        System.out.println(prov);
                        if (prov == 0)
                            System.out.println("Результат сложения числа " + numb1 + " и числа " + numb2 + " = " + summ);
                        else
                            System.out.println("Произошло переполнение");
                    }
                }
                break;
                case '2': {
                    System.out.println("Выбрана операция деления");
                    System.out.println("Введите 2 числа");
                    double numb3 = sc.nextInt();
                    double numb4 = sc.nextInt();
                    if (numb4 == 0)
                        System.out.println("На ноль делить нельзя");
                    else {
                        double del = (numb3 / numb4);
                        double prov1 = (del * numb4);

                        if (numb3 == prov1)
                            System.out.println("Результат деления числа " + numb3 + " на число " + numb4 + " = " + del);
                        else
                            System.out.println("Произошло переполнение");
                    }
                }
                break;
            }
        }
    }
}
