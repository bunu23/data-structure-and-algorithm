
import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis validator = new ValidParenthesis();

        String test1 = "()"; // Expected: true
        String test2 = "()[]{}"; // Expected: true
        String test3 = "(]"; // Expected: false
        String test4 = "([)]"; // Expected: false
        String test5 = "{[]}"; // Expected: true

        System.out.println("Test 1: " + validator.isValid(test1)); // Output: true
        System.out.println("Test 2: " + validator.isValid(test2)); // Output: true
        System.out.println("Test 3: " + validator.isValid(test3)); // Output: false
        System.out.println("Test 4: " + validator.isValid(test4)); // Output: false
        System.out.println("Test 5: " + validator.isValid(test5)); // Output: true
    }

}
