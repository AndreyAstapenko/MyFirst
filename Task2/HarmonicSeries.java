/* Написать программу, которая вычисляет сумму
        первых n членов ряда: 1 + 1/2 + 1/3 + 1/4 +….
        Количество суммируемых членов ряда задается
        во время работы программы.
*/
import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        double sum = 0.0;
        double s = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число соответствующее кол-ву элементов ряда");
            int n = sc.nextInt();
            for(double i = 1.0; i<=n; i++) {
                s = (double) (1.0 / i);
                sum = sum + s;
            }
        System.out.println("Сумма " + sum);
    }
}