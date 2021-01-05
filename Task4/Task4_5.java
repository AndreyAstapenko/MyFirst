//Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой.
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Task4_5 {
    public static void main(String[] args) {
        String str1 = "London is the capital of the Great Britain";
        String str2 = "London is capital of the the Britain Great";
        String [] str3 = str1.split(" ");
        String [] str4 = str2.split(" ");
        Arrays.sort(str3);
        Arrays.sort(str4);
        if (Arrays.equals(str3, str4))
            System.out.println("Строка 1 является перестановкой строки 2");
        else
            System.out.println("Строка 1 не является перестановкой строки 2");
    }
}