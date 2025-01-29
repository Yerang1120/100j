import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int f=0;
		
		Stack<Integer> stack = new Stack<>();
		for (int b=0;b<a;b++) {
			int c = Integer.parseInt(br.readLine());
			if (c==0) {
				stack.pop();
			}
			else {
				stack.push(c);
			}
		}
		int d = stack.size();
		for (int e=0;e<d;e++) {
			f=f+stack.get(e);
		}
		System.out.print(f);
	}
}
