package CalculatorModel;

public class CalculatorModel {
	private double value_1;
	private double value_2;
	private double answer;
	public CalculatorModel() {
		this.value_1 = 0;
		this.value_2 = 0;
		this.answer = 0;
	}
	public double getValue_1() {
		return value_1;
	}
	public void setValue_1(double value_1) {
		this.value_1 = value_1;
	}
	public double getValue_2() {
		return value_2;
	}
	public void setValue_2(double value_2) {
		this.value_2 = value_2;
	}
	public double getAnswer() {
		return answer;
	}
	public void setAnswer(double answer) {
		this.answer = answer;
	}
	
	public void cong()
	{
		this.answer = this.value_1 + this.value_2;
	}
	public void tru()
	{
		this.answer = this.value_1 - this.value_2;
	}
	public void nhan()
	{
		this.answer = this.value_1 * this.value_2;
	}
	public void chia()
	{
		this.answer = this.value_1 / this.value_2;
	}
	public void mu()
	{
		this.answer = Math.pow(this.value_1, this.value_2)   ;
	}
	public void mod()
	{
		int check1;
		int check2;
		check1= (int)this.value_1/1;
		check2= (int)this.value_2/1;
		if (check1 == this.value_1 && check2 == this.value_2) {
			this.answer = (int)this.value_1 % (int)this.value_2;
		} else this.answer = 0;
	}
}
