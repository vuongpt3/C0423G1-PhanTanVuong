package bai_18_string_and_regex.bai_tap.bai_2_validate_phone_number;

import bai_18_string_and_regex.thuc_hanh.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER = "^(\\(\\d{2})\\)-(\\(0\\d{9})\\)$";

    public ValidatePhoneNumber() {

    }

    public boolean validatePhoneNumber(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
