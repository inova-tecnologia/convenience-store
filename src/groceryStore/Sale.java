package groceryStore;

public class Sale {
	
	private String[] productList;
	private int[] quantity;    
	
    public String[] getProductList() {
        return this.productList;
    }
    
    public void setProductList(String[] productList) {
        this.productList = productList;
    }

    public int[] getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }
	
}
