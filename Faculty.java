public class Faculty
{
	public String showFacultyDetails(String universityName,String facultyName,String 	department)
	{
		return "University Name :"+universityName+"\nFaculty Name :"+facultyName+"\nDepartment :"+department;	}
	public static void main(String args[])
	{
		Faculty faculty=new Faculty();
		String details1=faculty.showFacultyDetails("Stanford University","Dr. Robort Brown","Computer Science");
		System.out.println(details1);
		System.out.println("---------------------------------------------------------");
		String details2=faculty.showFacultyDetails("Stanford University","Dr. Lisa Green","physics");
		System.out.println(details2);
		System.out.println("----------------------------------------------------------");
	}
}
