import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long Balance = 0; // balance, kopecks
        System.out.println(String.format("Balance: %s", Balance));
        System.out.print("Please, enter the account refill amount in rubles ");
        long AccountRefillAmount = (long)(in.nextDouble() * 100); // account refill amount, kopecks
        long BonusAmount = AccountRefillAmount > 100000 ? AccountRefillAmount / 100 : 0; // 1 ruble per 100 rubles
        Balance += AccountRefillAmount + BonusAmount; // new balance, kopecks
        System.out.println(String.format("Your bonus amount accrued, rubles: %s", BonusAmount / 100));
        System.out.println(String.format("New balance, rubles: %s", (double) Balance / 100));
    }
}
