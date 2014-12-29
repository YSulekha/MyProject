import java.util.Scanner;


public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bin2Dec bc = new Bin2Dec();
		System.out.println("Enter the binary number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		bc.convert(num);
	}
  public void convert(int num){
  	String strnum = Integer.toString(num);
  	int len = strnum.length();
  	char c;
  	int dec = 0;
  	int j= len;
  	for(int i = 0;i < len ;i++){
  		c = strnum.charAt(i);
  		j--;
  		if(c == '1')
  		  dec = dec+(int)Math.pow(2.0, (double)j);
  		System.out.println("dec"+dec+c);
  	}
  	System.out.println("Decimal equivalent of"+num+"is"+dec);
  }
}
