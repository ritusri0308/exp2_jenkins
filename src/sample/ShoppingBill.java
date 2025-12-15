package sample;
public class ShoppingBill {
	public static void main(String[] args) {
		double price=500.0;
		int qty=5;
		double total=price*qty;
		double discount=total*0.10;
		double finalAmount=total-discount;
		System.out.println("Totalo Amount: "+total);
		System.out.println("Discount: "+discount);
		System.out.println("Final Payable Amount: "+finalAmount);
	}
}
