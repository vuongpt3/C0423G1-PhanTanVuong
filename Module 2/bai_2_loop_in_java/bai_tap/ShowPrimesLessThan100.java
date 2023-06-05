package bai_2_loop_in_java.bai_tap;
import java.util.Scanner;
public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The prime numbers less than 100 are:");
        for (int i = 0; i < 100; i++) {
            if (isPrimesNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrimesNumber(int n){
        if (n < 2 ){
            return false;
        }else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
