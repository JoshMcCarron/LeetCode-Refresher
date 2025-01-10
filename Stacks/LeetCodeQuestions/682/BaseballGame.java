import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();

        for (String op: operations){
            if (op.equals("+")){
                int p = stack.pop();
                int sum = p + stack.peek();
                stack.push(p);
                stack.push(sum);
            }
            else if (op.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if (op.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.valueOf(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum+= stack.pop();
        }
        return sum;
    }
}
