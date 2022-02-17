package java20220210;

public class VIPCustomer extends Customer{
	double saleRatio;
	int pay;

	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public void calcPrice(int price) {
		this.price = price;
		bonusPoint += price*bonusRatio;
		pay = price-(int)(price*saleRatio);
	}
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며, 지불해야하는 금액은 " + pay + "이고 ,보너스 포인트는 "+bonusPoint+" 입니다.";
	}
}
