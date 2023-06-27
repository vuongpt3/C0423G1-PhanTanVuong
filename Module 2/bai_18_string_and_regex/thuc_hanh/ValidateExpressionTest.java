package bai_18_string_and_regex.thuc_hanh;

public class ValidateExpressionTest {
    public static ValidateEmail validateEmail;
    public static final String[] validEmail = new String[]{"a@gmail.com","asb@yahoo.com","abc@hotmail.com","abcd@gov.vn"};
    public static final String[] invalidEmail = new String[]{"a@gmail.","@yahoo.com","abc@.com","abcdgov.vn"};

    public static void main(String[] args) {
       validateEmail = new ValidateEmail();
       for (String email : validEmail){
           boolean valid = validateEmail.validate(email);
           System.out.println("Email : " + email  + " is valid : " + valid);
       }
       for (String email : invalidEmail){
           boolean invalid = validateEmail.validate(email);
           System.out.println("Email : " + email + " is valid : " + invalid);
       }
    }
}
