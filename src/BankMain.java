import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID ");
		int custId = sc.nextInt();
		System.out.println("Enter Customer Name ");
		String custName = sc.next();
		
		System.out.println("---------------ADDRESS--------------");
		System.out.println("Enter City ");
		String city=sc.next();
		System.out.println("Enter state ");
		String state = sc.next();
		System.out.println("Enter pincode ");
		int pinCode=sc.nextInt();
		
		Address addrobj = new Address(city,state, pinCode);
		
		System.out.println("----------Enter Account Details--------");
		System.out.println("Enter Account Number ");
		int accNumber = sc.nextInt();
		System.out.println("Enter Account Type ");
		String accType = sc.next();
		System.out.println("Enter IFSC code ");
		String ifscCode = sc.next();
		System.out.println("Enter Account Bal");
		double accBal=sc.nextDouble();
		
		Account accobj=null;
		if(accType.equals("saving"))
		{
			System.out.println("Enter Intrest rate");
			float interateRate=sc.nextFloat();
			accobj=new SavingAccount(accNumber, accType, accBal, ifscCode, interateRate);
		}
		
		if(accType.equals("current"))
		{
			System.out.println("Enter Company Name");
			String comapanyName=sc.next();
			accobj = new CurrentAccount(accNumber, accType, accBal, ifscCode, comapanyName);
		}
		
		Customer custobj=new Customer(custId, custName, addrobj, accobj);
		display(custobj);

	}
	
	public static void display(Customer cust) {
		System.out.println("-----------Customer Details-----------");
		System.out.println("Customer Id: "+cust.getCustId());
		System.out.println("Customer Name: "+cust.getCustName());
		System.out.println("------------Address Details----------");
		System.out.println("City: "+cust.getAddr().getCity());
		System.out.println("State: "+cust.getAddr().getState());
		System.out.println("pincode: "+cust.getAddr().getPincode());
		Account accobj=cust.getAccobj();
		System.out.println("------------Account Details----------");
		System.out.println("Account Number : "+cust.getAccobj().getAccNumber());
		System.out.println("Account Type: "+accobj.getAccType());
		System.out.println("Account IFSC :"+accobj.getIfscCode());
		System.out.println("Account Bal: "+accobj.getAccBal());
		
		if(accobj instanceof SavingAccount) {
			SavingAccount sacc=(SavingAccount)accobj;
			System.out.println("Intrest Rate : "+sacc.getIntrestRate());
		}
		if(accobj instanceof CurrentAccount) {
			CurrentAccount cacc=(CurrentAccount)accobj;
			System.out.println("Company Name : "+cacc.getCompanyName());
		}
		 
		 
	}

}
