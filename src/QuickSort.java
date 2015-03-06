
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
	public int partition(int[] quic){
		int pivot = quic[0];
		int i=1;
		int j=quic.length-1;
		int temp = 0;
		while(i <=j){
			while(i < quic.length && quic[i] <= pivot)
				i=i+1;
			while(j>=0 && quic[j] >= pivot)
				j=j-1;
			if(i >= quic.length)
				i=i-1;
			if(j < 0)
				j = j+1;
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
		return j;
		}
	public void quicksort(int [] quic){
		if(quic.length > 0){
		int s = partition(quic);
		int aux[];
		if(s > 0){
		aux = new int[s];
		for(int k = 0;k < s;k++){
			aux[k] = quic[k];
		}
		quicksort(aux);
		}
		aux = new int[quic.length-s-1];
		int h=0;
		for(int k = s+1;k < quic.length;k++){
			aux[h] = quic[k];
			h=h+1;
		}
		quicksort(aux);
		}
		for(int i = 0;i<quic.length;i++){
			System.out.print(quic[i]+" ");
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
