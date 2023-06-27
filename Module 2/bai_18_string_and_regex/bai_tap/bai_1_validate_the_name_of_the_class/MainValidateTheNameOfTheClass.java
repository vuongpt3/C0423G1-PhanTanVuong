package bai_18_string_and_regex.bai_tap.bai_1_validate_the_name_of_the_class;

import java.util.Scanner;

public class MainValidateTheNameOfTheClass {
    public static void main(String[] args) {
        ValidateTheNameOfTheClass validateTheNameOfTheClass = new ValidateTheNameOfTheClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi kiểm tra");
        String regex = scanner.nextLine();
        System.out.println(validateTheNameOfTheClass.validate(regex));
    }
}
