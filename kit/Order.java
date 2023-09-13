import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Order{
	
	private Member customer;
	private ArrayList<CartProduct> cartProd = new ArrayList<CartProduct>();

	private Date date = new Date();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyy");
	private SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");
    private String orderID = String.format("%sOrd%s", dateFormat.format(date),timeFormat.format(date));

	public Order(){
	}

	public Order(ArrayList<CartProduct> cartProd){
		this.cartProd = cartProd;
	}
	
	public Member getCustomer(){
		return customer;
	}

	public String getOrderID(){
		return orderID;
	}
	
	public ArrayList<CartProduct> getCartProd(){
		return cartProd;
	}

	public void setCustomer(Member customer){
		this.customer = customer;
	}
	
	public void setCartProd(ArrayList<CartProduct> cartProd){
		this.cartProd = cartProd;
	}

	
	
}