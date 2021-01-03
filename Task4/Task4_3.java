//Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
public class Task4_3 {
    public static void main (String [] args) {
        String str = "London is the capital of the Great Britain";
        String[] strParts = str.split(" ");
        for (String word : strParts) {
            if (word.matches("[^aeiouyAEIOUY]\\w++") && (word.length()==2))
                System.out.println(word);

        }
    }
}
