
public class SelectionSort {
	public int num[];
	public static void main(String args[]){
		SelectionSort s = new SelectionSort();
		s.randomNumberGen(8);
		s.print();
		s.sort();
		s.print();
	}
	public void sort(){
		int n = num.length;
		int min=0;
		int k=0;
		for(int i = 0;i < n-1;i++){
			min = i;
			for(int j = i+1;j < n ;j++){
				if(num[j] < num [min])
					min = j;
			}
			k = num[i];
			num[i] = num[min];
			num[min] = k;
			print();
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
