package bai_3_arrays_and_methods_in_java.bai_tap;

public class CountTheNumberOfOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        String str = "Helllllo Whats'up Bro";
        char checkChar = 'l';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == checkChar){
                count++;
            }
        }
        System.out.println("Character : " + checkChar + " . Appear " + count + " time " );
    }
}
