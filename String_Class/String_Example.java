class String_Example
 {
         public static void main (String []args)
         {
                   String s1 = "Computer";
                   String s2 = "Computer";
                   String s3 = new String ("Computer");
                   System.out.println("Result 1 : " + (s1 == s2));  // Comparing two reference variables
                   System.out.println("Result 2 : " + s1.equals(s2)); // Comparing the values of s1 & s2
                   System.out.println("Result 3 : " + (s1 == s3));  
                   System.out.println("Result 4 : " + s1.equals(s3));
          }
 }
         