//Реализуйте алгоритм, определяющий, все ли символы в строке встречаются один раз.
public class Task4_4 {
    public static void main(String [] args) {
        String str = "London";
        int count = 0;
        char charsArray[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
            if (charsArray[i] == charsArray[j] && i != j)
                System.out.println("символ " + charsArray[i] + " встречается не 1 раз");
            }
        }
    }
}