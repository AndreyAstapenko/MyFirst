public class StringOper {
    public static void main (String [] args) {
        String s = "Но я устал, окончен бой, беру портвейн, иду домой";
        System.out.println(s.length());
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);
        System.out.println(s1);
        System.out.println(s2);

    }
}