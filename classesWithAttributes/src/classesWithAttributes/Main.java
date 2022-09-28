package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("laptop");
		product.setId(1);
		product.setPrice(5000);
		product.stockAmount(42);
		product.setDiscription ("Asus Laptop");
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());

	}

}
