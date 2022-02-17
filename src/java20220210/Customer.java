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
		return customerName+"���� ����� "+customerGrade+"�̸�, �����ؾ� �� ���� " + price + "���̰�,���ʽ� ����Ʈ�� "+bonusPoint+" �Դϴ�.";
	}
}
