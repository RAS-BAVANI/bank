

class App {
    public static void main(String[] args) {

        double balance = 1000;
        double deposit = 500;
        double withdraw = 300;

        System.out.println("--- BANK APPLICATION ---");

        System.out.println("Initial Balance: " + balance);

        balance = balance + deposit;
        System.out.println("Deposited: " + deposit);

        balance = balance - withdraw;
        System.out.println("Withdrawn: " + withdraw);

        System.out.println("Final Balance: " + balance);

        System.out.println("Thank you for using Bank.");
    }
}
