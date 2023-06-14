package bai_8_cleancode_and_refactoring.thuc_hanh.bai_2_refactoring_variables_excaption;

public class FizzBuzz {
   public static String fizzBuzz(int number){
       boolean isFizz = number % 3 ==0;
       boolean isBuzz = number % 5 ==0;
       if (isFizz && isBuzz){
           return "FizzBuzz";
       }
       if (isFizz){
           return "Fizz";
       }
       if (isBuzz){
           return "Buzz";


       }
       return number + "";
   }

    public static void main(String[] args) {
        System.out.println("Result : " + fizzBuzz(19));
    }
}
