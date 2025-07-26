import java.util.Stack;

public class App {
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        smallestNumber(pattern);

    }

    public static String smallestNumber(String pattern) {
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        int n = pattern.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < pattern.length(); i++) {
            stack.add(num++);
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }

        }
        return result.toString();
    }
}
