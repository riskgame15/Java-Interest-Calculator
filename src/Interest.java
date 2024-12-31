import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money;
        double interestRate;
        double totalMoney = 0;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        money = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        interestRate = scanner.nextDouble();
        System.out.print("Enter the number of months: ");
        month = scanner.nextInt();

        for(int i = 0; i < month; i++){
            totalMoney += money * (interestRate/100)/12 * month;
        }
        System.out.println("the total money: " + totalMoney);
    }
}
