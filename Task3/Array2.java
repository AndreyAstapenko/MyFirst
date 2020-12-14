import static java.lang.Math.*;
public class Array2 {
    public static void main (String [] args) {
        int minValue, maxValue;
        int array[] = new int[10];
        for (int i =0; i<10; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        minValue = array[0];
        maxValue = array[0];
        for (int i=0; i<10; i++) {
            if (array[i]< minValue)
                    minValue = array[i];
            else if (array[i]>maxValue)
                    maxValue = array[i];
        }
            System.out.printf("%s%4d%n%s%4d%n", "min value = ", minValue, "max value = ", maxValue);

    }
}
