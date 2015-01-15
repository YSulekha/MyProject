
public class UserInputProcess {
	
		public static String Country;
		public static String State;
		public static String Locality;
		public static String Organization;
		public static String OrganizationUnit;
		public static String CommonName;
		public static String Email;
		
		public static void main(String args[]){
			UserInputProcess up = new UserInputProcess();
			Country = args[0];
			State = args[1];
			Locality = args[2];
			Organization = args[3];
			OrganizationUnit = args[4];
			CommonName = args[5];
			Email = args[6];
			System.out.println(Country+State+Locality+Email);
		}
}
