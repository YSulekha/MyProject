import java.util.Scanner;


public class PalindromeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeWord pk = new PalindromeWord();
		System.out.println("Enter the string : ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toLowerCase();
		pk.checkphrase(str);

	}
	public void check(String str){
		int len = str.length();
  	char c;
  	String pal = "";
  	for(int i=len-1;i>=0;i--){
  		pal = pal+str.charAt(i);
  	}
  	if(str.equals(pal))
  		System.out.println("Its a palindrome");
  	else
  		System.out.println("Not a palindrome"+pal);
	}
	
	public void checkphrase(String str){
		
	//	System.out.println(str);
		//str = str.replaceAll("[^a-zA-Z ]","");
		str = str.replaceAll("\\W","");
		//str = str.replace(" ", "");
		System.out.println("pal:"+str);
		int len = str.length();
		int i = 0;
		int j = len-1;
		char c,d;
		boolean pal = true;
		while(i != j){
			c = str.charAt(i);
			d = str.charAt(j);
			System.out.println("c:"+c+"d:"+d);
			if(c != d){
				pal = false;
				break;
			}
			i++;
			j--;
		}
		if(pal == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
			
		}
			
	}


