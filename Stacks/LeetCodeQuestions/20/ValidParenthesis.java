import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();

        for (char c: s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } 
            else{
            if (stack.isEmpty()){
                return false;
            }
            if (!isPair(stack.pop(), c)){
                return false;
            }
            }

        }
        return stack.isEmpty();
    }

    private boolean isPair (char left, char right){
        return (left == '(' && right == ')') ||
        (left == '[' && right == ']') ||
        (left == '{' && right == '}');
    }
}
