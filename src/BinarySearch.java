import java.util.Scanner;


public class BinarySearch {
	int nums[];
	int searchitem;
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
		System.out.println("enter the item to be searched");
		searchitem = s.nextInt();
	}
	public int search(){
		int low=0;
		int high = nums.length-1;
		int middle= (high-low)/2;
		while(high>low){
			if(searchitem > nums[middle])
				low = middle+1;
			else if(searchitem==nums[middle])
				return 1;
			else{
				high = middle-1;
			}
		}
		return 0;
	}
}
