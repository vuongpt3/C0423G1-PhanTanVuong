package bai_8_cleancode_and_refactoring.thuc_hanh.bai_1_refactoring_renaming_variables_and_separating_constants;

public class Caculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int caculator(int firstOpenrand , int secondOpenrand , char operator){
        switch (operator){
            case ADDITION:
                return firstOpenrand + secondOpenrand;
            case SUBTRACTION:
                return firstOpenrand - secondOpenrand;
            case MULTIPLICATION:
                return firstOpenrand * secondOpenrand;
            case DIVISION:
                if (secondOpenrand != 0)
                    return firstOpenrand / secondOpenrand;
                else
                    throw new RuntimeException("Can not divide by 0");

            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
