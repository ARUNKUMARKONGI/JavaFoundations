package StringBasics;
public class getCharExample {
    public static void main(String[] args) {
        String str = "Java Programming";

        char[] ch  = new char[str.length()];
        try {
            str.getChars(5, 7, ch, 0);
            System.out.println(ch);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}