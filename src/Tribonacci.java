
public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		Tribonacci f = new Tribonacci();
		int fib = 0;
		int sum = 0;
		for(int i = 0;i <= n ; i++){
			fib = f.trib(i);
			System.out.print(" "+fib);
			sum = sum+fib;
		}
		
	}
	public int trib(int i){
		if(i == 0)
			return 0;
		else if(i == 1 || i == 2)
			return 1;	
		else
			return (trib(i-1)+trib(i-2)+trib(i-3));
	}
}
	