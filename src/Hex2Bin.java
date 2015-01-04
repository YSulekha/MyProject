import java.util.Scanner;


public class Hex2Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hex2Bin hb = new Hex2Bin();
		System.out.println("Enter the hexadecimal number : ");
		Scanner s = new Scanner(System.in);
		String str = s.next().toLowerCase();
		hb.convert(str);
	}
	public void convert(String str){
		String hexbits[] = {"0000", "0001", "0010", "0011",
        "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1111"};
		int len = str.length();
		char c;
		String bin = "";
		boolean hex = true;
		for(int i = 0;i < len;i++){
			c = str.charAt(i);
			if((c - '0') >= 0 && (c - '0') <= 9 )
				bin = bin + " " + hexbits[c - '0'];
			else if((c-'a') >= 0 && (c - 'a') <= 5)
				bin = bin + " " + hexbits[c - 'a'+10];
			else{
				System.out.println("invalid number");
			 // hex = false;
				bin = null;
			  break;
			}
		}
		if(bin != null)
			System.out.println("Binary number"+bin);
			
		}
	}

