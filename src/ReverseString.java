import java.util.Scanner;
//import javax.net.ssl.SSLContext;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		rs.reverse(str);
	}
  public void reverse(String str){
  	int len = str.length();
  	String st = "";
  	for(int i = len-1;i >= 0;i--){
  		st = st + str.charAt(i);
  	}
  	System.out.println("Reverse String : "+st);
  }
}
