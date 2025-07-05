import java.util.Stack;

public class App {
    public static void main(String[] Args) {
        String s = "cb34";
        clearDigits(s);
        System.out.println(s);
    }

    public static String clearDigits(String s) {
        Stack<Character> a = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                a.push(c);
            } else {
                a.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : a) {
            sb.append(c);
        }
        String resultado = sb.toString();
        return resultado;
    }
}
