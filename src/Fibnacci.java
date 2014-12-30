
public class Fibnacci {

	public static void main(String[] args) {
		int n = 20;
		Fibnacci f = new Fibnacci();
		int fib = 0;
		int sum = 0;
		for(int i = 0;i <= n ; i++){
			fib = f.fib(i);
			System.out.print(" "+fib);
			sum = sum+fib;
		}
		double avg = (double)sum/n;
		System.out.println("\nAverage: "+avg);
		//System.out.println("Average: "+avg);
	}
	public int fib(int i){
		if(i == 0)
			return 0;
		else if(i == 1)
			return 1;	
		else
			return (fib(i-1)+fib(i-2));
	}
}


