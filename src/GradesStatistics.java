import java.util.Scanner;


public class GradesStatistics {
	public static int[] grades;
	public static void main(String args[]){
		readGrades();
		System.out.println("The average is " + average());
    System.out.println("The minimum is " + min());
    System.out.println("The maximum is " + max());
	}
	public static void readGrades(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = s.nextInt();
		int g = 0;
		grades = new int[n];
		for(int i = 0;i < n;i++){
			System.out.println("Enter the grade of Student "+(i+1)+":");
			g = s.nextInt();
			while(g < 0 || g >100){
				System.out.println("Enter valid grade");
				g = s.nextInt();
			}
			grades[i] = g;
		}
	}
	public static float average(){
		int sum = 0;
		int len = grades.length;
		for(int i = 0;i < len;i++){
			 sum = sum+grades[i];
		}
		return sum/(float)len;
			
	}
	public static int min(){
		int len = grades.length;
		int min = grades[0];
		for(int i = 1;i < len;i++){
			 if(min > grades[i])
				 min = grades[i];
		}
		return min;
	}
	public static int max(){
		int len = grades.length;
		int max = grades[0];
		for(int i = 1;i < len;i++){
			 if(max < grades[i])
				 max = grades[i];
		}
		return max;
	}
}
