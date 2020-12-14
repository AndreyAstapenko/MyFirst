import static java.lang.Math.*;
//В массиве из 10 чисел вычислить произведение элементов массива до первого нуля.
public class Array5 {
    public static void main (String [] args) {
        int array[] = new int[10];
        int pr = 1;
        for (int i =0; i<10; i++) {
            array[i] = (int) (Math.random() * 10 -5);
        }

        for (int i=0; i<10; i++) {
            if (array[i] == 0)
                break;
            pr *= array[i];
        }
        System.out.printf("%s%2d%n", "product of numbers =", pr);
    }
}
