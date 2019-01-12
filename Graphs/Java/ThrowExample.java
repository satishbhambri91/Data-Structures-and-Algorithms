public class ThrowExample {
   static void checkEligibilty(int stuage, int stuweight){
   try{ 
      if(stuage<12 && stuweight<40) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Student Entry is Valid!!"); 
      }
    }
    catch(Exception ex){
      System.out.println(ex.getMessage());
    }
   } 

   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     checkEligibilty(10, 39); 
     System.out.println("Have a nice day.."); 
 } 
}