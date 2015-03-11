import java.util.Scanner;


public class InsertionSort {
	int num[];
	public static void main(String args[]){
		InsertionSort i = new InsertionSort();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array/n");
		int size = s.nextInt();
		i.randomNumberGen(size);
		i.print();
		i.sort();
		i.print();
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
		int j=0;
		for(int i=1;i<num.length;i++){
			j = i;
			while(j>=1 && num[j] < num[j-1]){
					swap(j);
					j--;
				}
			}
			print();
		}

	public void swap(int k){
		int l = 0;
		l = num[k];
		num[k] = num[k-1];
		num[k-1] = l;
		}
}
