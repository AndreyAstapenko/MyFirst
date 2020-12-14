import static java.lang.Math.*;
public class Array3 {
    public static void main (String [] args) {
        int minValue, maxValue;
        int array[] = new int[15];
        for (int i =0; i<15; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int min = array[0];
        int min_i = 0;
        for (int i=0; i<15; i++) {
            if (array[i]< min) {
                min = array[i];
                min_i = i;
            }
        }
        System.out.printf("%s%4d%n%s%4d%n", "minimum element = ", min, "minimum element index = ", min_i);
    }
}
