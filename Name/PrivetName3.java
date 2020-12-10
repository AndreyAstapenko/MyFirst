import java.util.Scanner;
/** Программа выводящая Привет и имя
* для корректной работы необходимо
* в коммандной строке ввести chcp 1251
* а также выбрать шрифт Lucia.
*/
public class PrivetName3 {
    public static void main (String [] args) {
             System.out.println("Введи имя.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
