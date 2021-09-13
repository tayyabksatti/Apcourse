import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
	    int x;
	    int numaccounts=0;
	   int counter=0;
	    Account arr[] = new Account[20];
        do
        {
		System.out.println("Press 1 to Open a New Account");
		System.out.println("Press 2 to Close an Account");
		System.out.println("Press 3 to Login to an Account");
		System.out.println("Press 4 to Perform an Account Transaction");
		System.out.println("Press 5 to know the Interest Rate, applicable to all Savings Accounts");
	    System.out.println("Press 6 to Display all Account Details");
        System.out.println("Press 7 to Display Account Deductions as well as Details");
        
        Scanner inp= new Scanner(System.in);
        x=inp.nextInt();
       
        if (x==1) 
        {
        	
                arr[numaccounts] = new Account();
                arr[numaccounts].openNewAccount();
                numaccounts++;
            
  
        } 
        else if (x==2) 
        {
        	Scanner inp2= new Scanner(System.in);

        	String accountno=inp2.nextLine();
        	for(int i=0;i<numaccounts;i++)
        	{
        		Customer temp=arr[i].getCustomer();
        		if(temp.getAccountId()==accountno)
        		{
        			arr[i].setBal(arr[i+1].getBal());
        			arr[i].setAccountType(arr[i+1].getAccountType());
        			arr[i].getCustomer().setAccountId(arr[i+1].getCustomer().getAccountId());
        			arr[i].getCustomer().setPhoneno(arr[i+1].getCustomer().getPhoneno());
        			arr[i].getCustomer().setAddress(arr[i+1].getCustomer().getAddress());
        			arr[i].getCustomer().setCustomerName(arr[i+1].getCustomer().getCustomerName());
        			
        		}
        	}
        	
        	
        } else if (x==3) 
        {
        	Scanner inp1= new Scanner(System.in);
        	String accountno=inp1.next();
        	for(int i=0;i<numaccounts;i++)
        	{
        		Customer temp=arr[i].getCustomer();
        		if(temp.getAccountId().equals(accountno))
        		{
        			System.out.println(temp.getCustomerName());
        			System.out.println(temp.getAccountId());
        			System.out.println(arr[i].getBal());
        		}
        	}
        } 
        else if (x==4) 
        {
        	int x2=0;
        	
    		System.out.println("Press 1 to deposite amount");
    		System.out.println("Press 2 to withdraw amount");
    		System.out.println("Press 3 to check balance ");
    		System.out.println("Press 4 to detail of customer");
    		System.out.println("Press 5 to transfer amount ");
    		System.out.println("Press 6 to calculate zakat ");
    		System.out.println("Press 7 to all deduction ");
    		Scanner inp3= new Scanner(System.in);
    		x2=inp3.nextInt();
    		if(x2==1)
    		{
    			System.out.println("Enter accountno");
    			Scanner inp4= new Scanner(System.in);
    			String account=inp4.nextLine();
				
				  for(int i=0;i<numaccounts;i++)
				  { 
				  
					  Customer temp=arr[i].getCustomer();
					  if(temp.getAccountId().equals(account)) 
					  {
						 
						  arr[i].makeDeposite();
					  }
					  else
					  {
						  System.out.println("wrong account no");
					  }
				 }
				 
    		}
    		else if(x2==2)
    		{
    			System.out.println("Enter accountno");
    			Scanner inp4= new Scanner(System.in);
    			String account=inp4.nextLine();
				
				  for(int i=0;i<numaccounts;i++)
				  { 
				  
					  Customer temp=arr[i].getCustomer();
					  if(temp.getAccountId().equals(account)) 
					  {
						 counter++;
						  arr[i].Withdrawl();
					  }
					  else
					  {
						  System.out.println("wrong account no");
					  }
				 }
    		}
    		
    		else if(x2==3)
    		{
    			System.out.println("Enter accountno");
    			Scanner inp4= new Scanner(System.in);
    			String account=inp4.nextLine();
				
				  for(int i=0;i<numaccounts;i++)
				  { 
				  
					  Customer temp=arr[i].getCustomer();
					  if(temp.getAccountId().equals(account)) 
					  {
						  System.out.print("your balance is = ");
						  System.out.println(arr[i].getBal()); 
					  }
					  else
					  {
						  System.out.println("wrong account no");
					  }
				 }
    		}
    		else if(x2==4)
    		{
    			System.out.println("Enter accountno");
    			Scanner inp1= new Scanner(System.in);
            	String accountno=inp1.next();
            	for(int i=0;i<numaccounts;i++)
            	{
            		Customer temp=arr[i].getCustomer();
            		if(temp.getAccountId().equals(accountno))
            		{
            			System.out.println(temp.getCustomerName());
            			System.out.println(temp.getAccountId());
            			System.out.println(arr[i].getBal());
            		}
            	}
    		}
    		else if(x2==5)
    		{
    			System.out.println("Enter accountno");
    			Scanner inp4= new Scanner(System.in);
    			String account=inp4.nextLine();
				
				  for(int i=0;i<numaccounts;i++)
				  { 
				  
					  Customer temp=arr[i].getCustomer();
					  if(temp.getAccountId().equals(account)) 
					  {
						 counter++;
						  arr[i].transferAmount();
					  }
					  else
					  {
						  System.out.println("wrong account no");
					  }
				 }
    		}
    		else if(x2==6)
    		{
    			System.out.println("Enter accountno");
    			Scanner inp4= new Scanner(System.in);
    			String account=inp4.nextLine();
				
				  for(int i=0;i<numaccounts;i++)
				  { 
				  
					  Customer temp=arr[i].getCustomer();
					  if(temp.getAccountId().equals(account)) 
					  {
						 
						  arr[i].calculatezakat();
					  }
					  else
					  {
						  System.out.println("wrong account no");
					  }
				 }
    		}
    		else if(x2==7)
    		{
    			System.out.println("Enter accountno");
    			Scanner inp4= new Scanner(System.in);
    			String account=inp4.nextLine();
				
				  for(int i=0;i<numaccounts;i++)
				  { 
				  
					  Customer temp=arr[i].getCustomer();
					  if(temp.getAccountId().equals(account)) 
					  {
						 if(counter>=3)
						  {
							 arr[i].amountDeduction();
						  
						  }
						 else
						 {

							  System.out.print("NO balance is deducted ");
						 }
					  }
					  else
					  {
						  System.out.println("wrong account no");
					  }
				 }
    		}
    		
        	
        	} 
        else if (x==5) 
        {
    		System.out.println("Enter accountno");
			Scanner inp4= new Scanner(System.in);
			String account=inp4.nextLine();
			
			  for(int i=0;i<numaccounts;i++)
			  { 
			  
				  Customer temp=arr[i].getCustomer();
				  if(temp.getAccountId().equals(account)) 
				  {
					 if((arr[i].getAccountType().equals("s"))||((arr[i].getAccountType().equals("S"))))
					{
							 arr[i].calculateinterrestrate();
					}
				  }
				  else
				  {
					  System.out.println("wrong account no");
				  }
			 }
		}
        
        else if (x==6) 
        {
        	Scanner inp1= new Scanner(System.in);
        	String accountno=inp1.next();
        	for(int i=0;i<numaccounts;i++)
        	{
        		Customer temp=arr[i].getCustomer();
        		if(temp.getAccountId().equals(accountno))
        		{
        			System.out.println(temp.getCustomerName());
        			System.out.println(temp.getAccountId());
        			System.out.println(temp.getPhoneno());
        			System.out.println(temp.getAddress());
        			System.out.println(arr[i].getBal());
        		}
        	}
        } 
        else if (x==7) 
        {
        	System.out.println("Enter accountno");
			Scanner inp4= new Scanner(System.in);
			String account=inp4.nextLine();
			
			  for(int i=0;i<numaccounts;i++)
			  { 
			  
				  Customer temp=arr[i].getCustomer();
				  if(temp.getAccountId().equals(account)) 
				  {
					 
					
						
						 if(counter>=3)
						  {
							 arr[i].amountDeduction();
							 arr[i].calculateinterrestrate();
							 arr[i].calculatezakat();
						  }
						 else
						 {
							  System.out.println("NO balance is deducted ");
							 	 arr[i].calculateinterrestrate();
								 arr[i].calculatezakat();
						 }
				  }
				  else
				  {
					  System.out.println("wrong account no");
				  }
			 }
        }
        else 
        {
          System.out.println("You entered an invalid input");
        }
        }while(x!=8);

	}
}

