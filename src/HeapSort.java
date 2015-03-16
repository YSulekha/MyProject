import java.util.Scanner;


public class HeapSort {
	int num[];
	public static void main(String [] args){
		HeapSort h = new HeapSort();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array/n");
		int size = s.nextInt();
		h.randomNumberGen(size);
		h.print();
		h.sort();
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
	public void sort(){
		
	}
	public void swap(){
		
	}
}
