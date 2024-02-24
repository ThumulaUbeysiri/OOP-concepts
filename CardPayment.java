class CardPayment extends PaymentMethod
{
	protected String cardHolder;
	protected String bankName;
	protected double fTotal;
	protected double tot;
	
	public CardPayment(String cardHolder, String bankName, double[] price)
	{
		super(price);
		this.cardHolder=cardHolder;
		this.bankName=bankName;
		
				
	}
	
	public void displayCard()
	{
		displayBasicPayment();
		tot=calculateTotal();
		fTotal = tot*((double)105/100);
		System.out.println("Final total - Rs."+fTotal);
		System.out.println("Card holder name - "+cardHolder);
		System.out.println("Bank - "+bankName);
		System.out.println("--------------------------------");
	}

}