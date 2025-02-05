
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Deque<Integer> queue=new ArrayDeque<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1;i<n+1;i++) {
			queue.offer(i);
		}
		while(queue.size()>1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		String b = Integer.toString(queue.poll());
		
		bw.write(b);
		 bw.flush(); 
	     br.close();
	     bw.close();
	}
}
