import java.util.Scanner;


public class BinarySearch {
	int nums[];
	public static void main(String[] args){
		BinarySearch b = new BinarySearch();
		b.userInput();
		b.search();
	}
	public void userInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of inputs");
		int l = s.nextInt();
		nums = new int[l];
		System.out.println("Enter the inputs");
		for(int i = 0;i<nums.length;i++){
			nums[i] = s.nextInt();
		}
	}
	public int search(){
		int low=0;
		int high = nums.length-1;
		int middle= (high-low)/2;
		return 0;
	}
}
