
public class Gcd {
	public static void main(String [] args){
		Gcd gd = new Gcd();
		int m=30;
		int n=20;
		System.out.println(gd.findGcd(m,n));
	}
	public int findGcd(int m,int n){
		int r=0;
		while(n > 0){
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
}
