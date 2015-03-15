import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileScanner{
	
	public static int grades[];
	public static int bin[] = new int[10];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileScanner fs = new FileScanner();
		fs.fscanner();
	}
	public void fscanner() throws FileNotFoundException {
		Scanner s = new Scanner(new File("Filef.txt"));
		int num = s.nextInt();
		float f = s.nextFloat();
		String st = s.next();
		float sum = f + num;
		System.out.println(st+":The sum of "+num+","+f+" is "+sum);
	}

}
