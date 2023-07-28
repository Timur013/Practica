import java.util.Stack;

public class TextAnalyzer {

    public static boolean isTextValid(String text) {
        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openingBracket = stack.pop();
                if ((ch == ')' && openingBracket != '(') ||
                        (ch == ']' && openingBracket != '[') ||
                        (ch == '}' && openingBracket != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String text1 = "[({})]";
        String text2 = "[(){}";

        System.out.println(isTextValid(text1));
        System.out.println(isTextValid(text2));
    }
}