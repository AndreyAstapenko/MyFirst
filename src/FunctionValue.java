/* Напишите программу, которая выводит
на экран значения функции у = 2х^2-5х-8
в диапазоне от -4 до 4. Шаг изменения
аргумента 0,5. (^ - в степени)
 */

public class FunctionValue {
    public static void main(String[] args) {
        double y=0;
        System.out.println("Введи число сумму от 1 до которого надо вычислить");
        for (double x = (-4); x<=4; x=x+0.5) {
            y = 2*x*x-5*x-8;
            System.out.println("При х =" + x + " значение функции y =" + y);

        }

    }
}
