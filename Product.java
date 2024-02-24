class Product 
{
	protected String proName;
	protected String proID;
	protected Preference P1;
	
	public Product(String proName, String proID, String color, String size, String category, String material)
	{
		this.proName=proName;
		this.proID=proID;
		this.P1=new Preference(color, size, category, material);
	}
	
	public void displayDetails()
	{
		System.out.println("Product type - "+proName);
		System.out.println("Product ID - "+proID);
		System.out.println("--------------------------------");
		P1.displayDetails();
	}
}