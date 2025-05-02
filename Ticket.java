public class Ticket
{
	public String getTicketInfo(String theaterName,String movieName,String seatNo)
	{
		return "ThSeateater Name :"+theaterName+"\nMovie Name :"+movieName+"\nSeat No :"+seatNo;
	}
	public static void main(String args[])
	{
		Ticket ticket=new Ticket();
		String info1=ticket.getTicketInfo("Galaxy Cinemas","Intersteller","A10");
		System.out.println(info1);
		System.out.println("-------------------------------------------------------");
		String info2=ticket.getTicketInfo("Galaxy Cinemas","Inception","B12");
		System.out.println(info2);
		System.out.println("-------------------------------------------------------");
	}
}