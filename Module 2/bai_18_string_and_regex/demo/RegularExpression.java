package bai_18_string_and_regex.demo;

public class RegularExpression {
    public static void main(String[] args) {
        boolean a = "Java is fun".matches("Java.*");
        boolean b = "Java is best".matches("Java.*");
        boolean c = "Java is oke".matches("Java.*");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }
}
