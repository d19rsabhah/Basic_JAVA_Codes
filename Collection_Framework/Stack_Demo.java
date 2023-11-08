import java.io.*;
import java.util.*;

class Stack_Demo {
 public static void main(String[] args)
 {
  Stack stack1 = new Stack();

  Stack<String> stack2 = new Stack<String>();

  stack1.push(4);
  stack1.push("All");
  stack1.push("Strings");

  stack2.push("Collection");
  stack2.push("For");
  stack2.push("Strings");

  System.out.println(stack1);
  System.out.println(stack2);
 }
}
