/*  Написать программу вычисления суммы чисел от 1 до n.
 */
import java.util.Scanner;
public class Summa {
    public static void main(String[] args) {
        System.out.println("Введи число сумму от 1 до которого надо вычислить");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i=1; i<=n; i++) {
            s = s + i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " равна " + s);
    }
}
