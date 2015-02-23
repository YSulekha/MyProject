
public class MergeSort {
	int num [];
	public static void main(String [] args){
		MergeSort m = new MergeSort();
		m.randomNumberGen(9);
		m.print();
		//m.merge = new int[m.num.length];
		m.mergesort(m.num);
		m.print();
	}
	public void mergesort(int na[]){
		int n = na.length;
		int auxl[] = new int[n/2];
		int auxr[] = new int[n-n/2];
		if(n > 1){
			for(int i =0;i<auxl.length;i++){
				auxl[i] = na[i];
			}
			for(int i =0;i<auxr.length;i++){
				auxr[i] = na[i+n/2];
			}
			mergesort(auxl);
			mergesort(auxr);
			merge(auxl,auxr,na);
		//	System.out.println("mmmmm");
		}
	}
	public void merge(int left[],int right[],int merge[]){
		int i = left.length;
		int j = right.length;
		int m =0;
		int n = 0;
		int k=0;
	/*	for(int z =0;z<left.length;z++){
			System.out.print(left[z]+" lff");
			System.out.print(right[z]+" rggt");
		}*/
		while(m < i && n < j){
			if(left[m] <= right[n]){
				merge[k] = left[m];
				m++;
				k++;
			}
			else{
				merge[k] = right[n];
				n++;
				k++;
			}
		}
		if(n == j){
			while(m < i){
				merge[k] = left[m];
				m++;
				k++;
			}
		}
		else {
			merge[k] = right[n];
			n++;
			k++;
		}
		System.out.println("");
		for(int z =0;z<merge.length;z++){
			
			System.out.print(merge[z]+"mmm");
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
