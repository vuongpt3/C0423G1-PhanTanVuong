package bai_18_string_and_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    public Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9] + [A-Za-z0-9]*@[A-Za-z0-9] + (\\.[A-Za-z0-9] + )$";
    public ValidateEmail(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
