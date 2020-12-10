/*Написать программу, которая вычисляет факториал введенного с клавиатуры числа.
*/
import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args) {
        int f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число, факториал которого необходимо вычислить");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            f=f*i;
        }
        System.out.println("Факториал числа " + n + " = " + f);
    }
}
