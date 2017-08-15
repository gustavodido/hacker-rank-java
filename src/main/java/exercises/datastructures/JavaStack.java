package exercises.datastructures;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;
import static java.lang.System.out;

public class JavaStack {

    public void solve() {
        Scanner scan = new Scanner(in);

        while (scan.hasNext()) {
            Stack<Character> stack = new Stack<>();

            String currentLine = scan.nextLine();

            boolean hasRemaingBracket = false;

            for (int i = 0; i < currentLine.length(); i++) {
                Character currentChar = currentLine.charAt(i);

                if (isOpeningBracket(currentChar)) {
                    stack.push(currentChar);
                } else if (isClosingBracket(currentChar, stack)) {
                    stack.pop();
                } else {
                    hasRemaingBracket = true;
                    break;
                }
            }

            out.println(stack.empty() && !hasRemaingBracket);
        }
    }

    private boolean isClosingBracket(Character currentChar, Stack<Character> stack) {
        return !stack.empty() && (
                (currentChar == ')' && stack.peek() == '(') ||
                (currentChar == ']' && stack.peek() == '[') ||
                (currentChar == '}' && stack.peek() == '{'));
    }

    private boolean isOpeningBracket(Character currentChar) {
        return currentChar == '(' || currentChar == '[' || currentChar == '{';
    }


}
