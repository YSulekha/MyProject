import java.util.Scanner;


public class Hex2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hex2Dec hd = new Hex2Dec();
		System.out.println("Enter the hexadecimal number : ");
		Scanner s = new Scanner(System.in);
		String str = s.next().toLowerCase();
		hd.convert(str);
	}
	public void convert(String str){
		int len = str.length();
		int dec = 0;
		int j = 0;
		for(int i = len-1;i >= 0;i--){
			char c = str.charAt(i);
			System.out.println("c is"+c);
			if((c - '0') >= 0 && (c - '0') <= 9 )
				dec = dec+(c-'0')*(int)Math.pow(16, (double)j);
			else if((c-'a') >= 0 && (c - 'a') <= 5)
				dec = dec+((c-'a')+10)*(int)Math.pow(16, (double)j);
			else{
				System.out.println("Invalid number");
				dec = -1;
				break;
			}
			j++;
		}
		if(dec > 0)
			System.out.println("Equivalent number is "+dec);
	}
}
