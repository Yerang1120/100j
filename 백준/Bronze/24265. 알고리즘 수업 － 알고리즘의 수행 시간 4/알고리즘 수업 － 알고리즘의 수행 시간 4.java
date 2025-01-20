
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		long a = scan.nextLong();
		long b=0;
		for (long i=0; i< a; i++) {
			b=b+i;
		}
		System.out.println(b);
		System.out.print(2);
	}
}
