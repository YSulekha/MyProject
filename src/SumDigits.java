
public class SumDigits {
	public static void main(String [] args){
		SumDigits sd = new SumDigits();
		if(args.length != 1){
			System.err.println("Usage: java SumDigits num");
    	return;
		}
		sd.sum(Integer.parseInt(args[0]));
	}
	public void sum(int num){
		int div = 0;
		int sum = 0;
		String s = "";
		while(num >= 1){
			div = num%10;
			sum=sum+div;
			num = num/10;
			
			if(num >= 1){
				s = s + div + "+";
			}
		}
		s = s + div;
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println("The sum of digits ="+reverse +"="+sum);
	}
}
