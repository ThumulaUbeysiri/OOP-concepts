class Preference
{
	protected String color;
	protected String size;
	protected String category;
	protected String material;
	
	public Preference(String color, String size, String category, String material)
	{
		this.color=color;
		this.size=size;
		this.category=category;
		this.material=material;
	}
	
	public void displayDetails()
	{
		System.out.println("Color - "+color);
		System.out.println("Size - "+size);
		System.out.println("Category - "+category);
		System.out.println("Material - "+material);
		System.out.println("--------------------------------");
	}
	
}