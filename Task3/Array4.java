import static java.lang.Math.*;
public class Array4 {
    public static void main (String [] args) {
        int array[] = new int[10];
        for (int i =0; i<10; i++) {
            array[i] = (int) (Math.random() * 10 -5);
        }
        int otr = 0;
        for (int i=0; i<10; i++)
            if (array[i]< 0)
                otr++;
        System.out.printf("%s%2d%n", "Number of negative elements =", otr);
    }
}
