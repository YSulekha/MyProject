
public class ExtractDigit {
	public static void main(String args[]){
		ExtractDigit eg = new ExtractDigit();
		int n= 0123;
		eg.extract(n);
	}
  public void extract(int i){
  	int e = 0;
  	while(i > 0){
  		e = i % 10;
  		i = i / 10;
  		System.out.print(e);
  		System.out.print("i"+i);
  		if(i > 0)
  			System.out.print(",");
  	}
  }
}
