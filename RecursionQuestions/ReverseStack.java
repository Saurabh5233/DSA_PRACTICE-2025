import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        stack.push(4);
        stack.push(6);
        stack.push(3);
        stack.push(5);
        stack.push(1);

        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }
    private static void reverseStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int top = stack.pop();
            reverseStack(stack);
            insertReverse(stack, top);
        }
    }
    private static void insertReverse(Stack<Integer> stack , int top){
        if (stack.isEmpty()) {
            stack.push(top);
        }else{
            int element = stack.pop();
            insertReverse(stack, top);
            stack.push(element);
        }
    }
}
