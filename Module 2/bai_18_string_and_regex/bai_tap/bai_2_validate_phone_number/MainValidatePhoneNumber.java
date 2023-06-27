package bai_18_string_and_regex.bai_tap.bai_2_validate_phone_number;

import java.util.Scanner;

public class MainValidatePhoneNumber {
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi số điện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println(validatePhoneNumber.validatePhoneNumber(phoneNumber));
    }
}
