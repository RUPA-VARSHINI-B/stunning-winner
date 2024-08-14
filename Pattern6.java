package pattern;
import java .util.*;
public class Pattern6 {

	public static void main(String[] args) {
	 Scanner sca = new Scanner(System.in);
	 System.out.println("enter the no of rows");
	 int n = sca.nextInt();
	 pattern(n);
	}
public static void pattern(int n){
	char character ='A';
	for(int rows=1; rows<=n;rows++) {
	
		
		for( int col=1; col<=rows ;col++){
			int spaces= n-rows;
			for(int s=1;s<=spaces;s++){
			System.out.print(" ");
			}
	
			System.out.print(" * ");
		}
			System.out.println();
		}}
	
}

