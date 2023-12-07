
public class ComputerProgram {
	Inputter i = new Inputter();

	public double calculateNormal() {
		double x1 = 0;
		double x2 = 0;
		String o = "";
		double result = 0;
		while (!o.equals("=")) {
			if (result == 0) {
				x1 = i.inputDoubleNumber();
				o = i.inputOperator();
				x2 = i.inputDoubleNumber();
				switch (o) {
				case "+": {
					result = x1+x2;
					break;
				}
				case "-": {
					result = x1-x2;
					break;
				}
				case "*": {
					result = x1*x2;
					break;
				}
				case "/": {
					if (x2==0) 
					{
						System.out.println("Mẫu không được bằng 0!"); 
						break;
					}
					result = x1/x2;
					break;
				}
				default:
					result = Math.pow(x1, x2);
				}
			} else {
				System.out.println("Bộ nhớ: "+result);
				o = i.inputOperator();
				if (o.equals("=")) break;
				x2 = i.inputDoubleNumber();
				switch (o) {
				case "+": {
					result = result+x2;
					break;
				}
				case "-": {
					result = result-x2;
					break;
				}
				case "*": {
					result = result*x2;
					break;
				}
				case "/": {
					if (x2==0) 
					{
						System.out.println("Mẫu không được bằng 0!"); 
						break;
					}
					result = result/x2;
					break;
				}
				default:
					result = Math.pow(result, x2);
				}
			}
		}
		return result;
	}
	
	public BMIStatus calculateBMI()
	{
		Double weight =0.0;
		Double height =0.0;
		Double BMI = 0.0;
		System.out.println("Nhập cân nặng(kg): ");
		weight = i.inputDoubleNumber();
		System.out.println("Nhập chiều cao(cm): ");
		height = i.inputDoubleNumber();
		BMI = weight/(height*height)*10000;
		
		System.out.println("Chỉ số BMI: "+BMI);
		
		BMIStatus bs;
		if (BMI<19) bs = BMIStatus.UnderStandard;
		else if(BMI<=25) bs=BMIStatus.Standard;
		else if(BMI<=30) bs=BMIStatus.Overweight;
		else if(BMI<=40) bs=BMIStatus.Fat;
		else bs=BMIStatus.VeryFat;
		
		return bs;
	}
}
