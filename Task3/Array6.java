/*В массиве из 10 чисел переставить все нули в
конец массива, не меняя порядок ненулевых элементов.
 */
public class Array6 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10 - 5);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int j = 0; j<10; j++) {
            for (int i = 0; i < 9; i++) {
                if (array[i] == 0) {
                    int x = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = x;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
