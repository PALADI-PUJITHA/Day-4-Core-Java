public class Order
{
	public String getOrderDetails(String restaurantName,String foodItem,int quantity)
	{
		return "Restaurant Name :"+restaurantName +"\nFood Item :"+foodItem+"\nQuantity :"+quantity;
	}
	public static void main(String args[])
	{
		Order order=new Order();
		String details1=order.getOrderDetails("Spice Garden","Paneer Butter Masala",2);
		System.out.println(details1);
		System.out.println("----------------------------------------------");
		String details2=order.getOrderDetails("Spice Garden","Chicken Biryani",1);
		System.out.println(details2);
		System.out.println("----------------------------------------------");

	}
}

	