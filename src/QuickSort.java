
public class QuickSort {
	int num[];
	public static void main(String args[]){
		QuickSort q = new QuickSort();
		q.randomNumberGen(5);
		q.print();
		//m.merge = new int[m.num.length];
		q.quicksort(q.num);
		q.print();
	}
	public void quicksort(int[] quic){
		int pivot = quic[0];
		int i=1;
		int j=quic.length-1;
		int temp = 0;
		int aux[];
		while(i <=j){
			while(quic[i] < pivot)
				i=i+1;
			while(quic[j] > pivot)
				j=j-1;
			temp = quic[j];
			quic[j] = quic[i];
			quic[i] = temp;
		}
		if(j < i){
			temp = quic[j];
			quic[j] = quic[i];
			quic[i] = temp;
		}
		temp = quic[j];
		quic[j] = pivot;
		quic[0] = temp;
		aux = new int[i-0];
		for(int k = 0;k < j;k++){
			aux[k] = quic[k];
		}
		System.out.println("i "+i+"j "+j);
		for(int z=0;z<aux.length;z++){
			System.out.print(aux[z]+" ");
		}
		quicksort(aux);
		aux = new int[j-i];
		for(int k = j;k < quic.length;k++){
			aux[k] = quic[k];
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
