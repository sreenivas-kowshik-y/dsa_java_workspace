// Demonstrating Encapsulation (Access Control) and Abstraction (Abstract Classes)
public class EncapsulationAndAbstraction {

    // Abstraction: Abstract Class
    static abstract class BankAccount {
        private String accountHolder; // Encapsulation: Private Field
        protected double balance;

        BankAccount(String accountHolder, double initialBalance) {
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        // Abstract method
        abstract void calculateInterest();

        // Getter & Setter (Encapsulation)
        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }
    }

    static class SavingsAccount extends BankAccount {
        SavingsAccount(String holder, double balance) {
            super(holder, balance);
        }

        @Override
        void calculateInterest() {
            double interest = balance * 0.04;
            System.out.println("Savings Interest: $" + interest);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount("Kowshik", 10000.0);
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: $" + acc.getBalance());
        acc.calculateInterest();
    }
}
