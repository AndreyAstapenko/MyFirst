/* 1. В английском тексте каждую букву заменить ее порядковым
номером в алфавите. При выводе в одной строке печатать текст с
двумя пробелами между буквами, в следующей строке внизу под
каждой буквой печатать ее номер.
 */
public class Task4_1 {
    public static void main (String [] args) {
        String str = "London is the capital the Great Britain"; // Исходная строка
        String str1 = str.replace(" ",""); //убрали пробелы
        String str2 = str1.toUpperCase(); // Все буквы сделали большими
        char[] charArray = new char[str2.length()]; // массив символов для сопоставления с позицией алфавита
        char[] charArray1 = new char[str2.length()]; // массив символов для вывода строки в конце
        charArray1 = str1.toCharArray();
        charArray = str2.toCharArray();
        char [] charAlpha = new char[26]; // массив для алфавита
        int [] index = new int[str2.length()]; // массив для позиций букв
        for (int i = 0; i < 26; i++) {  //заполняем массив буквами
            charAlpha[i] = (char)(65+i);
           //System.out.println(charAlpha[i]);
        }
        for (int i = 0; i < charArray.length; i++) { // алгоритм заполнения массива индекс позициями букв
            for (int j = 0; j < charAlpha.length; j++) {
            if (charAlpha[j]==(charArray[i])) {
                index[i] = (charAlpha[j]-64);
              //  System.out.println(index[i]);
                }
            }
        }
        for (int i = 0; i < charArray1.length; i++) { //вывод исходной строки
            System.out.printf("%3c", charArray1[i]);
        }
        System.out.println();
        for (int i = 0; i<index.length; i++) { //вывод позиций
            System.out.printf("%3d", index[i]);
        }
        System.out.println();
    }
}