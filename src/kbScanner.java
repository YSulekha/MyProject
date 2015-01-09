import java.util.Scanner;
public class kbScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kbScanner kb = new kbScanner();
		kb.kbinput();
	}
	public void kbinput(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an Integer:");
		int inpInt = in.nextInt();
		System.out.print("Enter Float number:");
		float inpFloat = in.nextFloat();
		float pro = inpInt*inpFloat;
		System.out.print("Product is: "+pro);
	}
}
