import static java.lang.Math.*;

public class Array1 {
    public static void main (String [] args) {
        float averageValue = 0;
        float summ = 0;
        float array[] = new float[10];
        for (int i=0; i<10; i++)
        array[i] = (float)(Math.random()*10);
        for (int i=0; i<10; i++)
            System.out.printf("%.2f%s",array[i], " | ");
        System.out.println();
        for (int i=0; i<10; i++)
            summ += array[i];
        averageValue = summ/(array.length);
        System.out.printf("%s%.2f", "average value =", averageValue);
    }
}
