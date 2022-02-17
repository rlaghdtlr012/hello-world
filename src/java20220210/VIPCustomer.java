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
		return customerName+"���� ����� "+customerGrade+"�̸�, �����ؾ��ϴ� �ݾ��� " + pay + "�̰� ,���ʽ� ����Ʈ�� "+bonusPoint+" �Դϴ�.";
	}
}
