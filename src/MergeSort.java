
public class MergeSort {
	int num [];
	public static void main(String [] args){
		MergeSort m = new MergeSort();
		m.randomNumberGen(8);
		m.print();
		m.mergesort(m.num);
		m.print();
	}
	public void mergesort(int na[]){
		int n = na.length;
		int auxr[] = new int[n/2];
		int auxl[] = new int[n/2];
		if(n > 1){
			for(int i =0;i<auxr.length;i++){
				auxl[i] = na[i];
				auxr[i] = na[i+n/2];
			}
			mergesort(auxl);
			mergesort(auxr);
			merge(auxl,auxr);
			System.out.println("mmmmm");
			print();
		}
	}
	public void merge(int left[],int right[]){
		int i = left.length;
		int j = right.length;
		int m =0;
		int n = 0;
		int k=0;
		for(int z =0;z<left.length;z++){
			System.out.print(left[z]+" vv");
			System.out.print(right[z]+" vv");
		}
		while(m < i && n < j){
			if(left[m] <= right[n]){
				num[k] = left[m];
				m++;
				k++;
			}
			else{
				num[k] = right[n];
				n++;
				k++;
			}
		}
		if(n == j){
			while(m < i){
				num[k] = left[m];
				m++;
				k++;
			}
		}
		else {
			num[k] = right[n];
			n++;
			k++;
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
