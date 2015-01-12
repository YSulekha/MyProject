
public class Arithmetic {
	public static void main(String [] args){
		Arithmetic a = new Arithmetic();
		if(args.length != 3){
			System.err.println("Usage: java Arithmetic int1 int2 op");
    	return;
		}
		int one = Integer.parseInt(args[0]);
		int two = Integer.parseInt(args[1]);
		char op = args[2].charAt(0);
		a.calculate(one,two,op);
	}
	public void calculate(int one,int two,char op){
		int result=0;
		switch(op){
		case '+':result = one+two;
						 break;
		case '-':result = one-two;
		         break;
		case '*':result = one*two;
    				 break;
		case '/':result = one/two;
    				 break;
    default:System.out.println("Invalid operator");
             break;
        
		}
		System.out.println("Result:"+result);
	}
}
