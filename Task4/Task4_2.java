//Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
public class Task4_2 {
    public static void main (String [] args) {
        String str = "London, is$ the/ capital, of the Great Britain!?";
        str=str.replaceAll("[^A-Za-zА-Яа-я]+", " ");
        System.out.println(str);
    }
}
