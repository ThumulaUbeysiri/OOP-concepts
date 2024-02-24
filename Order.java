class Order
{
	protected String orderID;
	protected String orderDate;
	protected PaymentMethod PM1;
	
	public Order(String orderID, String orderDate, double[] price)
	{
		this.orderID=orderID;
		this.orderDate=orderDate;
		this.PM1=new PaymentMethod(price);
	}
	
		
	public void displayOrder()
	{
		System.out.println("Order ID - "+orderID);
		System.out.println("Order date - "+orderDate);
		System.out.println("--------------------------------");

	}
}