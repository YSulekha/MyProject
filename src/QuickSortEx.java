import java.util.Scanner;


public class QuickSortEx {
	int num[];
	public static void main(String args[]){
		QuickSortEx q = new QuickSortEx();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array/n");
		int size = s.nextInt();
		q.randomNumberGen(size);
		q.print();
		q.sort(0, q.num.length-1);
		//int l = q.partition(0, q.num.length-1);
	//	System.out.println(l);
		q.print();
	}
	public int partition(int left,int right){
		int pivot = num[left];
		int i = left;
		int j = right;
		boolean inwhile = false;
		while(i<j){
			while(i < right && num[i] <= pivot){
				i = i+1;
			}
			while(j > left && num[j] >= pivot){
				j = j-1;
			}
			swap(i,j);
			//inwhile = true;
		}
		if(i > j){
			swap(i,j);
		}
	//	if(inwhile == true)
			swap(left,j);
		print();
		System.out.println(j+ " "+left +" "+" "+right);
		return j;
	}
	public void swap(int i,int j){
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	public void sort(int left,int right){
	if(left<right){
		int s = partition(left,right);
		if(s > 1){
			sort(left , s-1);
		}
		if(s < right-1)
		sort(s+1,right);
		}
	}
	public void randomNumberGen(int size){
		num = new int[size];
		for(int i=0;i<num.length;i++){
			num[i] = (int)(100*Math.random());
		}
	}
	public void print(){
		for(int i = 0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
}
