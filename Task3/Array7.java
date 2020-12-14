/*Даны натуральное число n, действительная матрица А
размером n x n. Получить последовательность элементов
главной и побочной диагонали.
 */
import java.util.Scanner;
public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the dimension of the matrix");
        int n = sc.nextInt();
        System.out.println("\n" +
                "The matrix is ready:");
        int array[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
        array[i][j] = (int) (Math.random() * 10);
        System.out.printf("%3d%s", array[i][j], "\t");
    }
        System.out.println();
}
        System.out.println("Main diagonal:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j)
                    System.out.printf("%3d", array[i][j]);
            }

            }
        System.out.println();
        System.out.println("side diagonal:");
        for (int i = (array.length-1); i>=0; i--) {
            for (int j = (array.length-1); j>=0; j--) {
                if ((i+j)==(n-1))
                    System.out.printf("%3d", array[i][j]);
            }
        }
        System.out.println();
    }
}
