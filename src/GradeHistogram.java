import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GradeHistogram {
	public static int grades[];
	public static int bin[] = new int[10];
	public static void main(String [] args) throws FileNotFoundException{
		readgrades();
		evaluateGrades();
		printgrade();
	}
	public static void readgrades() throws FileNotFoundException{
		Scanner s = new Scanner(new File("Grad.txt"));
		int noofstudents = s.nextInt();
		grades = new int[noofstudents];
		int j = 0;
		while(j< noofstudents){
			grades[j] = s.nextInt();
			j++;
		}
	}
	public static void evaluateGrades(){
		for(int i = 0;i < grades.length;i++){
			int k = grades[i]/10;
			bin[k] = bin[k]+1;
		}
	}
	public static void printgrade(){
		int l = 0;
		System.out.print("  ");
		for(int i = 0;i<bin.length;i++){
			System.out.print(l+"-"+(l+9));
			for(int k = 1;k <= bin[i];k++){
				System.out.print(" *");
			}
			System.out.println();
			l = l+10;
		}
	}
}
