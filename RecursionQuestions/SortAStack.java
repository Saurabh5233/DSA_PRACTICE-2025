import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        stack.push(4);
        stack.push(6);
        stack.push(3);
        stack.push(5);
        stack.push(1);

        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);
        
    }
    private static void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        else{
            int top = stack.pop();
            sortStack(stack);  // recursively sort...
            insertCorrectly(stack, top);
        }
    }
    private static void insertCorrectly(Stack<Integer> stack, int element){
        if(stack.isEmpty() || stack.peek() <= element){
            stack.push(element);
            return;
        }else{
            int top = stack.pop();
            insertCorrectly(stack, element);
            stack.push(top);
            return;
        }
    }
}
