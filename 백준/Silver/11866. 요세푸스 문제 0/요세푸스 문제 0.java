
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); 
        int K = Integer.parseInt(input[1]); 
        int[] e = new int[N];
        for (int i = 0; i < N; i++) {
            e[i] = i + 1;
        }


        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int index = 0;  
        int remaining = N;  

        for (int i = 0; i < N; i++) {
            index = (index + (K - 1)) % remaining; 
            sb.append(e[index]);

            if (i != N - 1) {
                sb.append(", ");
            }


            for (int j = index; j < remaining - 1; j++) {
                e[j] = e[j + 1];
            }
            remaining--;
        }

        sb.append(">");

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}
