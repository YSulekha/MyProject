
public class BubbleSort {
	public int num[];
	public static void main(String args[]){
		BubbleSort b = new BubbleSort();
		b.randomNumberGen(8);
		b.print();
		b.sort();
		b.print();
	}
	public void sort(){
		int n = num.length;
		int k=0;
		for(int i = 0;i < n-1;i++){
			for(int j = 1;j < n-i ;j++){
				if(num[j-1] > num [j]){
					k = num[j];
					num[j] = num[j-1];
					num[j-1] = k;
				}
			}
			print();
		}
	/*	System.out.println("+++++++++++");
		for(int i = 0;i < n-1;i++){
			for(int j = 0;j < n-i-1 ;j++){
				if(num[j+1] < num [j]){
					k = num[j];
					num[j] = num[j+1];
					num[j+1] = k;
				}
			}
			print();
		}*/
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
