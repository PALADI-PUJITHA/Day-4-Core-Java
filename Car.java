public class Car
{
	public String displayDetails(String showroomName,String modelName,int price)
	{
		return "Showroom Name :"+showroomName+"\nCar Model :"+modelName+"\nCar Price :"+price;
 	}
	public static void main(String[] args)
	{
		Car car=new Car();
		String details1=car.displayDetails("Elite Motors", "Tesla Models",80000);
		System.out.println(details1);
		System.out.println("-------------------------------------------------");
		String details2=car.displayDetails("Elite Motors", "BMW x5",75000);
		System.out.println(details2);
		System.out.println("-------------------------------------------------");

	}
}