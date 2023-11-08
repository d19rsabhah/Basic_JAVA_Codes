public class Example 
{
     public static void main(String []args)
      {
         Student S = new Student();
         S.set_roll_no(161);
         S.set_Name("Rishav Das");
         S.set_Age(20);
         S.set_Institution("Bengal College of Engineering and Technology");
         System.out.println("Name :- "+ S.get_Name());
         System.out.println("Roll No. :- "+ S.get_roll_no());
         System.out.println("Age :- "+ S.get_Age());
         System.out.println("Institution :- "+ S.get_Institution());
       }
}