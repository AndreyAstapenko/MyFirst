/* Написать программу, которая выводит
таблицу квадратов первых десяти целых
положительных чисел от 0 до 10
 */
public class TableOfSquares {
    public static void main(String[] args) {
        int t[] = new int[100];
        int i;
        for(i=0; i<100; i++) {
            t[i] = (i+1)*(i+1);
            if (i<30)
                System.out.print("\t"+"\t");
            if (i>30 & i<100)
                System.out.print("    ");
            if (i%10 == 0)
                System.out.println();

            System.out.print(t[i]);

        }
    }
}
