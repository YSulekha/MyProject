import java.util.Scanner;


public class DigitSum {
	public static void main(String args[]){
		DigitSum s = new DigitSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<size;i++){
			num[i] = sc.nextInt();
		}
		s.getDigitSum(num);
	}
	public void getDigitSum(int [] num){
		
	}
}
