public class Patient
{
	public String printDetails(String hospitalName,String patientName,int age)	
	{
		return "Hospital Name :"+hospitalName+"\nPatient Name :"+patientName+"\nPatient Age :"+age;	}
	public static void main(String args[])
	{
		Patient patient=new Patient();
		String details1=patient.printDetails("City Care Hospital","Joh Doe",45);
		System.out.println(details1);
		System.out.println("------------------------------------------");
		String details2=patient.printDetails("City Care Hospital","Emma Watson",30);
		System.out.println(details2);
		System.out.println("------------------------------------------");
	}
}