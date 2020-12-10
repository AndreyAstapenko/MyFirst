/* Написать программу, которая после введенного с клавиатуры числа 
(в диапазоне от 1 до 999), обозначающего денежную единицу, дописывает 
слово "рубль" в правильной форме. Например, 12 рублей, 21 рубль и т. д.
*/
import java.util.Scanner;
public class Rubl {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число от 1 до 999");
        int r = sc.nextInt();
        String rub = Integer.toString(r);
        int dl = rub.length();
        char p = rub.charAt(dl-1);
        if (p == '1')
            System.out.println(r + " рубль");
        else if ((p == '2') || (p == '3') || (p == '4'))
            System.out.println(r + " рубля");
        else
            System.out.println(r + " рублей");

    }
}
