package bai_2_loop_in_java.bai_tap;
import java.util.Scanner;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the sequence of salt primes : ");
        int number = input.nextInt();
        for (int i = 0; count < number; i++) {
            if (isPrimesNumber(i)){
                System.out.println(i + " ");
                count++;
            }
        }
    }
    public static boolean isPrimesNumber(int n){
        if (n < 2){
            return false;
        }else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
