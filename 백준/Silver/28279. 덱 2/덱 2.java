import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque=new ArrayDeque<>();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
        	String b = br.readLine();
			String[] c = b.split("\\s+");
            switch (c[0]) {
                case "1":
                    deque.addFirst(Integer.parseInt(c[1]));
                    break;
                case "2":
                    deque.addLast(Integer.parseInt(c[1]));
                    break;
                case "3":
                    bw.write(deque.isEmpty() ? "-1\n" : deque.pollFirst()+"\n");
                    break;
                case "4":
                    bw.write(deque.isEmpty() ? "-1\n" : deque.pollLast()+"\n");
                    break;
                case "5":
                	bw.write(deque.size()+"\n");
                    break;
                case "6": 
                	bw.write(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case "7":
                	bw.write(deque.isEmpty() ? "-1\n" : deque.peekFirst()+"\n");
                    break;
                case "8":
                	bw.write(deque.isEmpty() ? "-1\n" : deque.peekLast()+"\n");
                    break;
            }
        }

        bw.flush();
    }
}
