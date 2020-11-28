import java.util.Scanner;
public class PrivetName3 {
    public static void main (String [] args) {
             System.out.println("Введи имя.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
