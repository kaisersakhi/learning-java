package excepHandling;

/*
    Author : Kaiser Sakhi
	Env : Win10
	Date : 17-Feb-2022
*/

// to throw a custom exception on low bank balance on withdrawal

class InsufficientBalanceException extends Exception{
    double amount;
    double bal;
    InsufficientBalanceException(double amount, double bal) {
        this.amount = amount;
        this.bal = bal;
    }
    @Override
    public String getMessage(){
        return ("Error: Funds aren't sufficient for this withdrawal, requested to" +
                " withdraw : ["+this.amount +"] | Actual Balance: "+this.bal+" InsufficientBalanceException.");
    }
}


class Customer{
    private final int accountNo;
    private double balance;
    Customer(int accountNo){
        this.accountNo = accountNo;
        this.balance = 0;
    }
    public void deposit(double amount){
        if (amount >= 100){
            this.balance += amount;
        }
    }

    public void withdraw(float amount) throws InsufficientBalanceException {
        if (this.balance - amount >= 50){ // let's say, min balance should be 50
            this.balance -= amount;
        }else{
            throw new InsufficientBalanceException(amount, this.balance);
        }
    }

    public double getBalance(){
        return this.balance;
    }
    public int getAccountNo() {
        return accountNo;
    }
}

public class Bank {
    public static void main(String[] args) {
        Customer customer = new Customer(5678);
        // logically here should also be LowDepositBalanceException,
        // but hey i've to implement custom exception not the whole banking system ;)
        customer.deposit(110);
        try {
            customer.withdraw(70f);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
