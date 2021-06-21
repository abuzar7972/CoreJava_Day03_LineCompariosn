import java.util.Scanner;
public class LineComparisonProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for line 1 x");
		int x1 = sc.nextInt();
		System.out.println("Enter value for line 1 y");
                int y1 = sc.nextInt();
		System.out.println("Enter value for line 2 x");
                int x2 = sc.nextInt();
		System.out.println("Enter value for line 2 y");
                int y2 = sc.nextInt();
		System.out.println("Enter value for line 2 constant");
		int line1 = ((3*x1)+(5*y1));
		int line2 = ((10*x2)-(2*y2));
		if (line1 == line2)
			System.out.println("Two lines are equal");
		else
			System.out.println("Lines are not equal");
}
}
