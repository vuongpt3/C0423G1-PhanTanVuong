package bai_18_string_and_regex.bai_tap.bai_1_validate_the_name_of_the_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTheNameOfTheClass {
    private static final String NAME_CLASS_REGEX = "^[C|A|P]\\d{4}[G|H|I|K]$";

    public ValidateTheNameOfTheClass() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
