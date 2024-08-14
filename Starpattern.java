package pattern;
import java .util.*;
public class Starpattern {

	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("enter the no of rows");
		int n = sca.nextInt();
		pattern(n);
	}
static void pattern(int n) {
	for(int row=1;row<=n;row++) {
		for(int col = 1;col<=row;col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
