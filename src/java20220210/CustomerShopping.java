package java20220210;

public class CustomerShopping {

	public static void main(String[] args) {
		Customer customerPark = new Customer();
		customerPark.setCustomerName("°¨Áß¿¡");
		customerPark.calcPrice(10000);
		System.out.println(customerPark.showCustomerInfo());
		
		
		Customer customerYoon = new VIPCustomer();
		customerYoon.setCustomerName("È«½Ã");
		customerYoon.calcPrice(10000);
		System.out.println(customerYoon.showCustomerInfo());
	}
}
