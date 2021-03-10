import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long balance = 0; // balance, kopecks
        System.out.println(String.format("Balance: %s", balance));
        System.out.print("Please, enter the account refill amount in rubles ");
        long accountRefillAmount = (long) (in.nextDouble() * 100); // account refill amount, kopecks
        long bonusAmount = accountRefillAmount > 100000 ? accountRefillAmount / 10000 * 100 : 0; // 1 ruble per 100 rubles
        balance += accountRefillAmount + bonusAmount; // new balance, kopecks
        System.out.println(String.format("Your bonus amount accrued, rubles: %s", bonusAmount / 100));
        System.out.println(String.format("New balance, rubles: %s", (double) balance / 100));
    }
}
