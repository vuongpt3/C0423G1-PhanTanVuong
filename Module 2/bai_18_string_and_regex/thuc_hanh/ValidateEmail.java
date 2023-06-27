package bai_18_string_and_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9] + [A-Za-z0-9]*@[A-Za-z0-9] + (\\.[A-Za-z0-9] + )$";

    public ValidateEmail() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
