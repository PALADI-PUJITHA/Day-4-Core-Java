public class Travel
{
	public String getBookingDetails(String agency,String destination,int travellers)
	{
		return "Agency :"+agency+"\nDestination :"+destination+"\nTravellers :"+travellers;
	}
	public static void main(String args[])
	{
		Travel travel=new Travel();
		String details1=travel.getBookingDetails("Wanderlust Travels","paris",2);
		System.out.println(details1);
		System.out.println("----------------------------------------------------");
		String details2=travel.getBookingDetails("Wanderlust Travels","Tokyo",3);
		System.out.println(details2);
		System.out.println("----------------------------------------------------");
	}
}

