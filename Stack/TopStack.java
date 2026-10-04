import java.util.Stack;

public class TopStack{

    public static void main(String[] args){
        Stack<String> stack = new Stack<>();

        stack.push("Welcome");
        stack.push("To");
        stack.push("Web");
        stack.push("Hit");

        //Displaying the stack
        System.out.println(stack);

        System.out.println("The element at the  top of the "+ "stack is:" + stack.peek());

        System.out.println("Final Stack: " +stack);
    }
}

//OUTPUT:

//[Welcome, To, Web, Hit]
//The element at the top of the stack is:Hit
//Final Stack: [Welcome, To, Web, Hit]
