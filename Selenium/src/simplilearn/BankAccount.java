package simplilearn;

public class BankAccount {
	
	int accountNumber;
	double balance = 0;
	String customerName;
	String email;
	String phoneNumber;
	
	public BankAccount(int accountNumber, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public double showBalance() {
		return this.balance;
	}
	
	 public void depositAmount(double amount) {
		 if(amount < 0){
			 System.out.println("Deposit Amount needs to be greater than or equal to Zero");
		 }else {
			 this.balance += amount;
			 System.out.println("Amount: Rs." + amount + " has been added to the account");
		 }
	 }
	 
	 public void withdrawAmount(double amount) {
		 if (amount < 0) {
			System.out.println("Withdraw Amount should be greater than zero.");
		}else if (amount > this.balance) {
			System.out.println("OOPS!! Insufficient Funds!!");
		}else {
			this.balance -= amount;
			System.out.println("Amount: Rs." + amount + " has been withdrawn");
		}
	 }
	 
	 public static void main(String[] args) {
			BankAccount raja = new BankAccount(1234, "Raja", "raja.ladha@pinelabs.com", "9988779988");
			System.out.println(raja.showBalance());
			raja.depositAmount(99);
			System.out.println(raja.showBalance());
			raja.depositAmount(-100.00);
			System.out.println(raja.showBalance());
			raja.withdrawAmount(98);
			System.out.println(raja.showBalance());
			raja.withdrawAmount(-99);
			System.out.println(raja.showBalance());
			raja.withdrawAmount(2);
			System.out.println(raja.showBalance());
		}
}
