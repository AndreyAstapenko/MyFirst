/*Реализуйте метод, осуществляющий сжатие строки,
        на основе счетчика повторяющихся символов.
        Например, строка aabcccccaaa должна превратиться в a2b1c5a3.
        Если «сжатая» строка оказывается длиннее исходной, метод должен
        вернуть исходную строку. */
public class Task4_7 {
    public static void main (String [] args) {
String str = "aabcccccaaa";
String str1 = "";
int count = 1;
for (int i = 0; i < str.length()-1; i++) {
    if (str.charAt(i) == str.charAt(i +1)) {
        count = count + 1;
        if (i == str.length()-2) {
            str1 = str1 + str.charAt(i)+count;
        }
    }
    else {
        str1 = str1 + str.charAt(i) + count;
        count = 1;
    }
        }
if (str1.length()>str.length())
    System.out.println(str);
else
System.out.println(str1);
    }
}