
public class Main {
	public static void main(String[] args) {
		int choice = 0;
		do {
			choice = SolveFunction.menu();
			switch (choice) {
            case 1:
            	SolveFunction.superlativeEquation();
                break;
            case 2:
            	SolveFunction.quadraticEquation();
                break;
            case 3:
            	System.out.println("Bai bai!");
                return;
        }
		} while (choice<1 || choice>3);
	}
}