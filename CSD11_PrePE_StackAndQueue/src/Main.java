
import java.util.Stack;

public class Main {

    public static int Precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0; // "("
    }

    public static boolean isOperator(char op) {
        return (op == '+' || op == '-' || op == '*' || op == '/');
    }
    
    public static double calculate(double b, char op, double a) {
        double c;
        switch (op) {
            case '+':
                c = (a + b);
                break;
            case '-':
                c = (a - b);
                break;
            case '*':
                c = (a * b);
                break;
            default:
                c = (a / b);
                break;
        }
        return c;
    }

    public static void main(String[] args) {
        String infix = "(- 2.0 + ( - 1.22 - 3.4 * -55 + - 3 ) - -2 / - 2)";
//        String infix = "( - 1.2 - 3.4 * 1 + - 3 )";
        System.out.println("The infix expression: \n"+infix);

        // MODULE 1: Convert an infix expression to the suffix one.
        String suffix = "";
        int sign = 1;
        Stack<Character> S = new Stack<>();
        boolean needOneOperand = true;
        for (int i = 0; i < infix.length(); i++) {
            char tok = infix.charAt(i);
            if (tok == ' ') {
                continue;
            }
            if (tok == '-' && needOneOperand) {
                sign = -sign;
                continue;
            }
            if (isOperator(tok)) {
                while (!S.empty() && Precedence(tok) <= Precedence(S.peek())) {
                    suffix += S.pop() + " ";
                }
                S.push(tok);
                needOneOperand = true;
            } else if (Character.isDigit(tok)) {
                double number = 0; 
                boolean flip = false; 
                double mauso = 10;
                for (; i < infix.length(); i++) {
                    char newChar = infix.charAt(i);
                    if (newChar == '.') {
                        flip = true;
                    } else 
                    {
                        if (!Character.isDigit(newChar)) {
                            --i;
                            break;
                        }
                        if (!flip)
                            number = number * 10 + (newChar - '0');
                        else {
                            number = number + (newChar - '0') / mauso;
                            mauso *= 10;
                        }
                    }
                }
                number = sign * number;
                sign = 1;
                suffix += (number + " ");
                needOneOperand = false;
            } else if (tok == '(') {
                S.push(tok);
                needOneOperand = true;
            } else { // if (tok == ')'
                while (!S.empty() && S.peek() != '(') {
                    suffix += S.pop() + " ";
                }
                S.pop();
                needOneOperand = false;
            }
        }
        while (!S.empty()) {
            suffix += S.pop() + " ";
        }
        
        System.out.println("\nThe suffix expression: \n"+suffix);
        // MODULE 2: Evaluate the suffix.
        
        Stack<Double> S2 = new Stack<>();
        String[] tokens2 = suffix.split(" ");
        for (String tok : tokens2) {
            if (tok.length() == 1 && isOperator(tok.charAt(0))) {
                double x = calculate(S2.pop(), tok.charAt(0), S2.pop());
                S2.push(x);
            } 
            else {
                S2.push(Double.parseDouble(tok));
            }
        }
        System.out.println("The value is: " + S2.pop());
        
        double x = (- 2.0 + ( - 1.22 - 3.4 * -55 + - 3 ) - -2 / - 2);
        System.out.println("\nThe value by Java: " + x);
    }
}