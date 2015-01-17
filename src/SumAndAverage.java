
public class SumAndAverage {
	public static void main(String args[]){
		int UpperBound = 101;
		int LowerBound = 10;
		int n = (UpperBound-LowerBound)+1;
		int sum = (n*(n+1))/2;
		double avg = (double)sum/n;
		System.out.println("Average:"+avg);
		System.out.println("Sum:"+sum);
	}
}
