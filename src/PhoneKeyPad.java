import java.util.Scanner;


public class PhoneKeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneKeyPad pk = new PhoneKeyPad();
		System.out.println("Enter the string to be converted : ");
		Scanner s = new Scanner(System.in);
		String str = s.next().toLowerCase();
		pk.convert(str);
	}
  public void convert(String str){
  	int len = str.length();
  	char c;
  	String num = "";
  	for(int i = 0;i < len;i++){
  		c = str.charAt(i);
  		if(c == 'a'||c=='b'||c == 'c')
  			num = num+'2';
  		else if(c == 'd'||c=='e'||c == 'f')
  			num = num+'3';
  		else if(c == 'g'||c=='h'||c == 'i')
  			num = num+'4';
  		else if(c == 'j'||c=='k'||c == 'l')
  			num = num+'5';
  		else if(c == 'm'||c=='n'||c == 'o')
  			num = num+'6';
  		else if(c == 'p'||c=='q'||c == 'r' || c =='s')
  			num = num+'7';
  		else if(c == 't'||c=='u'||c == 'v')
  			num = num+'8';
  		else if(c == 'w'||c=='x'||c == 'y' || c == 'z')
  			num = num+'9';
  		else
  			num = num+""; 		  		
  	}
  	System.out.println("Equivalent number is: "+num);
  }
}
