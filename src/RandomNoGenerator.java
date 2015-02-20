import java.util.Scanner;


public class RandomNoGenerator {
	public static int num[];
	public static void main(String [] args){
		System.out.println("Enter the number of randonm no's needed");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		noGenerator(n);
		for(int i = 0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
	public static void noGenerator(int size){
		num = new int[size];
		for(int i=0;i<num.length;i++){
			num[i] = (int)(1000*Math.random());
		}
	}
}
