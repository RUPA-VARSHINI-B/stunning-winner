package pattern;
import java .util.*;
public class pattern3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sca.nextInt();
			pattern(n)	;
			pattern1(n)	;
  
	}
	public static void pattern(int n) {
		for(int rows=n;rows>=1;rows--)
			{
			for(int col=1;col<=rows;col++) {
				System.out.print("* ");
			}
			System.out.println();
			}
	}
	public static void pattern1(int n) {
		for(int rows=1;rows<=n;rows++)
			{
			for(int col=1;col<=n+1-rows;col++) {
				System.out.print("* ");
			}
			System.out.println();
			}
	}

}
