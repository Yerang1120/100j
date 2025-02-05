
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Deque<Integer> queue=new ArrayDeque<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a=Integer.parseInt(br.readLine());
		
		for (int i = 0;i<a;i++) {
			String b = br.readLine();
			String[] c = b.split("\\s+");
			switch (c[0]) {
				case "pop":
					bw.write(queue.isEmpty() ?"-1\n":queue.poll()+"\n");
					break;
				case "size":
					bw.write(queue.size()+"\n");
					break;
				case "empty":
					bw.write(queue.isEmpty() ?"1\n" : "0\n");
					break;
				case "front":
					bw.write(queue.isEmpty() ?"-1\n" : queue.peek()+"\n");
					break;
				case "back":
					bw.write(queue.isEmpty() ? "-1\n" : queue.peekLast() + "\n");
                    break;
				case "push":
					int number = Integer.parseInt(c[1]);
					queue.offer(number);
					break;
					
			}
		}
		bw.flush();
		bw.close();
		
	}
}
