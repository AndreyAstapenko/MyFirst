import java.util.Scanner;
public class LeapYear {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи год");
        int numb = sc.nextInt();
        if ((numb % 4) == 0 && (numb % 100) == 0 && (numb % 400) == 0)
            System.out.println(numb + " год - високосный");
        else
            System.out.println(numb + " год - не високосный");

    }
}
