import java.util.Scanner;
public class Account {

	   
		/*
		 * public Account(String accountType, long bal, Customer customer, Scanner inp1)
		 * { super(); this.accountType = accountType; this.bal = bal; this.customer =
		 * customer; this.inp1 = inp1; }
		 */

		private String accountType;
	    private long bal;
	    private Customer customer =new Customer();
	    
	    Scanner inp1 = new Scanner(System.in);
	    
	    //method to open an account
	    void openNewAccount() {
	        System.out.print("Enter your name: ");
	        customer.setCustomerName(inp1.nextLine()); 
	        System.out.print("Enter your account id: ");
	       customer.setAccountId(inp1.nextLine());
	        System.out.print("Enter the type of account you want: C for checkings and S for savings : ");
	        accountType = inp1.nextLine();
	        System.out.print("Enter your balance : ");
	        bal = inp1.nextLong();
	        inp1.nextLine();
	        System.out.print("Enter your phone no : \n");
	        customer.setPhoneno(inp1.nextLine()); 
	        System.out.print("Enter your address  : ");
	        customer.setAddress(inp1.nextLine()); 
	        
	        
	    }

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public long getBal() {
			return bal;
		}

		public void setBal(long bal) {
			this.bal = bal;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public Scanner getInp1() {
			return inp1;
		}

		public void setInp1(Scanner inp1) {
			this.inp1 = inp1;
		}
	    
		 void makeDeposite()
		{
			long b;
			System.out.println("Enter balance you want to deposite");
			Scanner inp= new Scanner(System.in);
	        b=inp.nextLong();
			this.setBal(b+this.getBal());
		}
		 void Withdrawl()
		 {
			 long b;
				System.out.println("Enter balance you want to withdrawl");
				Scanner inp= new Scanner(System.in);
		        b=inp.nextLong();
				this.setBal(this.getBal()-b);
		 }
		 void transferAmount()
		 {
			 long b;
				System.out.println("Enter amount you want to transfer");
				Scanner inp= new Scanner(System.in);
		        b=inp.nextLong();
				this.setBal(this.getBal()-b);
				System.out.println("Succesfully you  transfer the amount");
				
		 }
		 void calculatezakat()
		 {
			 System.out.println("zakat on this amount is ="+(this.getBal()*2.5)/100);
		 }
		 void amountDeduction()
		 {
			 int deduct=10;
			 
				 System.out.println(" Amount is deducted= "+deduct);
				 deduct=deduct+10;
		 }
		 void calculateinterrestrate()
		 {
			 System.out.println("interest rate of 5.5 on this amount is ="+(this.getBal()*5.5)/100);
		 }
}
