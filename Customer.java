class Customer
{
	protected String name;
	protected int phoneNumber;
	protected String customerID;
	protected Order OR1;
	
	
	public Customer(String name, int phoneNumber, String customerID, String orderID, String orderDate, double[] price)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.customerID=customerID;
		this.OR1=new Order(orderID, orderDate, price);
	}
	
	public void displayCustomer()
	{
		System.out.println("Customer name - "+name);
		System.out.println("Customer ID - "+customerID);
		System.out.println("Contacts - "+phoneNumber);
		System.out.println("--------------------------------");
		OR1.displayOrder();
	}
	
	public void displayOnlyCustomer()
	{
		System.out.println("Customer name - "+name);
		System.out.println("Customer ID - "+customerID);
		System.out.println("Contacts - "+phoneNumber);
		System.out.println("--------------------------------");
		
	}
	

}