import java.util.Scanner;


public class CircleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleComputation kb = new CircleComputation();
		kb.kbinput();
	}
	public void kbinput(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius:");
	  float inpInt = in.nextFloat();
		float pro = (float)Math.PI*inpInt*inpInt;
		System.out.print("Area is: "+pro);
	}
}


