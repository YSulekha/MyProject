
public class CozaLoza {

	public static void main(String[] args) {
		int f = 1;
		int l = 110;
		boolean print = false;
		for(int i = f;i <=l;i++){
			if(i%3 == 0){
				System.out.print("Coza");
				print = true;
			}
			if(i%5 == 0){
				System.out.print("Loza");
				print = true;
			}
			if(i%7 == 0){
				System.out.print("woza");
				print = true;
			}
			if(print == false){
				System.out.print(i);
							}
			if(i%11 == 0)
				System.out.println("");
			else
				System.out.print(" ");
			print = false;

		}

	}

}
