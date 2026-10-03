import java.util.Stack;

public class CreateStack{
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

        stack.push("N");
        stack.push("A");
        stack.push("Y");
        stack.push("A");
        stack.push("A");
   
    while(!stack.isEmpty()) {
      System.out.println(stack.pop());
    }

  }

}

//output:
// A
// A
// Y
// A
// N
