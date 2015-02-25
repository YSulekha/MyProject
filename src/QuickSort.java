
public class QuickSort {
	int num[];
	public static void main(String args[]){
		QuickSort q = new QuickSort();
		q.randomNumberGen(9);
		q.print();
		//m.merge = new int[m.num.length];
		q.quicksort(q.num);
		q.print();
	}
	public void quicksort(int[] quic){
		int pivot = num[0];
		int i=1;
		int j=quic.length-1;
		while(i <=j){
			if(quic[i] < pivot)
				i++;
			else if (quic[j] > pivot)
				j++;
			else{
				
			}
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
