import java.util.Scanner;

class CashPayment extends PaymentMethod
{
	protected double cashAmount;
	protected double change;
	protected String cashRecievedDate;
	protected Scanner scan;
	
	public CashPayment(String cashRecievedDate, double[] price)
	{
		super(price);
		this.cashRecievedDate=cashRecievedDate;
		this.scan=new Scanner(System.in);
		
		System.out.println("--------------------------------");
		System.out.println("Enter cash amount: ");
		System.out.println("--------------------------------");
		
		this.cashAmount=scan.nextDouble();
		
		System.out.println("Cash amount recieved - Rs."+cashAmount);
	
		change = cashAmount - calculateTotal();
	
	    System.out.println("Change - Rs."+change);
		
	}
	
	
	public void displayCash()
	{
		System.out.println("--------------------------------");
		displayBasicPayment();
		System.out.println("Cash recieved date - "+cashRecievedDate);
	}
	
	
	
	
	
}