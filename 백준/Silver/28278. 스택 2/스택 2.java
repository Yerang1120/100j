
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
	
				
		for (int b=0;b<a;b++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c= Integer.parseInt(st.nextToken());
			
			switch(c) {
				case 1:
					int d=Integer.parseInt(st.nextToken());
					stack.push(d);
					break;
					
				case 2:
					
					if (stack.isEmpty()==true) {
						System.out.println("-1");
					}
					else {
						System.out.println(stack.pop());
					}
					break;
				case 3:
					int f = stack.size();
					System.out.println(f);
					break;
				case 4:
					if (stack.isEmpty()==true) {
						System.out.println("1");
					}
					else {
						System.out.println("0");
					}
					break;
				case 5:
					if (stack.isEmpty()==true) {
						System.out.println("-1");
					}
					else {
						int g= stack.peek();
						System.out.println(g);
					}
					break;
			}
		}
	}
}
