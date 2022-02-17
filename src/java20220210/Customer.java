package java20220210;

public class Customer {
	private int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint=0;
	double bonusRatio;
	public int price;

	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	public void calcPrice(int price) {
		this.price = price;
		bonusPoint += price*bonusRatio;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며, 지불해야 할 값은 " + price + "원이고,보너스 포인트는 "+bonusPoint+" 입니다.";
	}
}
