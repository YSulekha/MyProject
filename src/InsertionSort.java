import java.util.Scanner;


public class InsertionSort {
	int num[];
	public static void main(String args[]){
		InsertionSort i = new InsertionSort();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array/n");
		int size = s.nextInt();
		i.randomNumberGen(size);
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
