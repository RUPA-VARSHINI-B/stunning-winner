package pattern;
import java .util.*;
public class pattern5 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sca.nextInt();
		pattern(n);
	}
public static void pattern(int n) {
	for(int rows=1;rows<=n;rows++) {
		int c = rows>n?2*n-rows:rows;
		for(int col=1;col<=c;col++)
		{
			System.out.print(" * ");
		}
		System.out.println()
;	}
}
}
