

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (char ch : input.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch); 
                } else if (ch == ')' || ch == ']') {
                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    }

                    char last = stack.pop();
                    if ((ch == ')' && last != '(') || (ch == ']' && last != '[')) {
                        isBalanced = false;
                        break;
                    }
                }
            }

            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
