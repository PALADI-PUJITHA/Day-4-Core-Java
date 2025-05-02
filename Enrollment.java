public class Enrollment
{
	public String getEnrollment(String platform,String course,String student)
	{
		return "Platform :"+platform+"\nCourse :"+course+"\nStudent :"+student;
	}
	public static void main(String args[])
	{
		Enrollment enrollment=new Enrollment();
		String details1=enrollment.getEnrollment("Udemy","Java Programming","Alice");
		System.out.println(details1);
		System.out.println("------------------------------------------------------");
		String details2=enrollment.getEnrollment("Udemy","Web Development","Bob");
		System.out.println(details2);
		System.out.println("------------------------------------------------------");
	}
}

