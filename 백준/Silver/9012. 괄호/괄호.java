
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        scan.nextLine();

        for (int i = 0; i < a; i++) {
            String input = scan.nextLine(); 
            int b = 0; 
            boolean isValid = true;

            for (char ch : input.toCharArray()) {
                if (ch == '(') {
                    b=b+1;
                } else if (ch == ')') {
                    b=b-1;
                    if (b < 0) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && b == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
