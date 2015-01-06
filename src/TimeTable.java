
public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 12;
		System.out.print("*"+"\t"+"|");
		for(int i=1;i <=size;i++){
			System.out.print("\t"+i);
		}
		System.out.println("\n---------------------------------------------------------------------------------------------");
		for(int i = 1;i <= size ;i++){
			System.out.print(i+"\t"+"|"+"\t");
			for(int j = 1 ; j <= size; j++){
				System.out.print(i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
