
public class CheckerBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 7;
		for(int i = 0;i < size ;i++){
			if(i%2 != 0)
				System.out.print(" ");
			for(int j = 0;j < size;j++){
				System.out.print("# ");
			}
			System.out.println("");
			
		}
	}

}
