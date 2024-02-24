class PaymentMethod
{
	
	protected double[] price;
	
	public PaymentMethod( double[] price)
	{
		
		this.price=price;
		
	}
	
		
	public double calculateTotal()
	{
		double total = 0;
		for(double price : price)
		{
			total += price;
		}
		
		return total;
	}
	
	public void displayBasicPayment()
	{
		System.out.println("Total is "+calculateTotal());
		System.out.println("--------------------------------");
		
	}
}