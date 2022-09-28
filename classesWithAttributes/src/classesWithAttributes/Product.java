package classesWithAttributes;

public class Product {
	
	public Product(int id,String name,String discription,double price,int stockAmount,String renk) {
		System.out.println("Yapıcı Blok Çalıştı");
		
		this.id = id;
		this.description = description;
		this._renk = renk;
		this.setName(name);
		this.price = price;
		
		
	}
	public Product() {
		
	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String _renk;
	
	
	//getter
  public int getId() {
	  return id;
  }
   //setter
  public void setId(int id) {
	  id=id;
  }
private String getName() {
	return name;
}
private void setName(String name) {
	this.name = name;
}

}



