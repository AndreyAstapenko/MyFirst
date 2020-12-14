/*В данной квадратной целочисленной матрице разместить столбцы так,
чтобы элементы на главной диагонали были расположены по возрастанию.
Если это невозможно - выдать сообщение.
 */
import java.util.Scanner;
public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the dimension of the matrix");
        int n = sc.nextInt();
        int index_i=0;
        int index_j =0;
        System.out.println("The matrix is ready:");
        int array[][] = new int[n][n];
        int array1[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.printf("%3d%s", array[i][j], "\t");
            }
            System.out.println();
        }
        System.out.println("matrix with ascending elements on the main diagonal:");
        for (int i = 0; i < (array.length-1); i++) {
            for (int j = 0; j < (array.length-1); j++) {
                if (i==j) {
                    if ((array[i][j] > array[i + 1][j + 1]) && (array[i][j+1] < array[i+1][j])) {
                        index_i =i;
                        index_j =j;
                        for (i=0;i< (array.length); i++) {
                            for (j=index_j; j <= index_j; j++ ) {
                                int x = array[i][j];
                                array[i][j] = array[i][j + 1];
                                array[i][j + 1] = x;
                            }
                        }
                    }
                    else
                        System.out.println("Error");
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%3d%s", array[i][j], "\t");
            }
            System.out.println();
        }
    }
}