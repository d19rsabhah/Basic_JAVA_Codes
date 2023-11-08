import java.lang.String.*;
public class Show_Data
 {
          public static void main(String []args)
            {
                    String s1 = new String("CommandPrompt");
                    System.out.println("Before Converting in Upper Case :- " + s1);
                    String s2 = s1.toUpperCase();
                    System.out.println("\nApplying Upper Case Conversion :- " + s2);
                    s2 = s1.toLowerCase();
                    System.out.println("\nApplying Lower Case Conversion :- " + s2);
             }
 }