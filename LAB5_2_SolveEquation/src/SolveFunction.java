


import java.util.Scanner;

/**
 *
 * @author THAYCACAC
 */
public class SolveFunction {

    private static final Scanner sc = new Scanner(System.in);

    //dispaly menu
    public static int menu() {
    	System.out.println("\n\n");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 3);
        return choice;
    }

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input double
    public static double checkInputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }

    //check number is odd or not
    public static boolean isOdd(double n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    //check number is even or not
    public static boolean isEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //check number is squarenumber or not
    public static boolean isSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }

    //allow user calculate Superlative Equation
    public static void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        double x = -b / a;
        System.out.println("\nSolution: x=" + x);
        System.out.print("Number is odd: ");
        if (isOdd(a)) {
            System.out.print(a + "(a)\t");
        }
        if (isOdd(b)) {
            System.out.print(b + "(b)\t");
        }
        if (isOdd(x)) {
            System.out.print(x + "(x)\t");
        }
        System.out.print("\nNumber is even: ");
        if (isEven(a)) {
            System.out.print(a + "(a)\t");
        }
        if (isEven(b)) {
            System.out.print(b + "(b)\t");
        }
        if (isEven(x)) {
            System.out.print(x + "(x)\t");
        }
        System.out.print("\nNumber is perfect square: ");
        if (isSquareNumber(a)) {
            System.out.print(a + "(a)\t");
        }
        if (isSquareNumber(b)) {
            System.out.print(b + "(b)\t");
        }
        if (isSquareNumber(x)) {
            System.out.print(x + "(x)\t");
        }
    }

    //allow user calculate Quadratic Equation
    public static void quadraticEquation() {
    	double x1=0;
    	double x2=0;
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        System.out.print("Enter C: ");
        double c = checkInputDouble();
        double mys = -b/(2*a);
        double delta = b * b - 4 * a * c;
        if (delta<0) {
			return;
		} else if (delta>0) {
			x1 = mys + Math.sqrt(delta)/(2 * a);
	        x2 = mys - Math.sqrt(delta)/(2 * a);
	        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
		}  else {
			x1 = mys;
			x2 = x1;
		}
        
        
        System.out.print("\nNumber is odd: ");
        if (isOdd(a)) {
            System.out.print(a + "(a)\t");
        }
        if (isOdd(b)) {
            System.out.print(b + "(b)\t");
        }
        if (isOdd(c)) {
            System.out.print(c + "(c)\t");
        }
        if (x1!=x2) {
        	if (isOdd(x1)) {
                System.out.print(x1 + "(x1)\t");
            }
            if (isOdd(x2)) {
                System.out.print(x2 + "(x2)\t");
            }
		} else if(isOdd(x1)) System.out.print(x1 + "(x)\t");
        
        System.out.print("\nNumber is even: ");
        if (isEven(a)) {
            System.out.print(a + "(a)\t");
        }
        if (isEven(b)) {
            System.out.print(b + "(b)\t");
        }
        if (isEven(c)) {
            System.out.print(b + "(c)\t");
        }
        if (x1!=x2) {
        	if (isEven(x1)) {
                System.out.print(x1 + "(x1)\t");
            }
            if (isEven(x2)) {
                System.out.print(x2 + "(x2)\t");
            }
		} else if(isEven(x1)) System.out.print(x1 + "(x)\t");
        
        
        System.out.print("\nNumber is perfect square: ");
        if (isSquareNumber(a)) {
            System.out.print(a + "(a)\t");
        }
        if (isSquareNumber(b)) {
            System.out.print(b + "(b)\t");
        }
        if (isSquareNumber(c)) {
            System.out.print(c + "(c)\t");
        }
        if (x1!=x2) {
        	if (isSquareNumber(x1)) {
                System.out.print(x1 + "(x1)\t");
            }
            if (isSquareNumber(x2)) {
                System.out.print(x2 + "(x2)\t");
            }
		} else if(isSquareNumber(x1)) System.out.print(x1 + "(x)\t");
    }
}
