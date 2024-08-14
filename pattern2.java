package pattern;
import java .util.*;
public class pattern2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("enter the no of rows");
		int n = sca.nextInt()
;
		pattern(n);
	}
public static void pattern(int n) {
	for(int rows=1;rows<=n;rows++) {
		for(int col=1;col<=n;col++) {
			System.out.print("* ");
		}
		System.out.println();
	
	}
}
}
