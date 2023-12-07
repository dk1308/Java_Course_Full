package model;

public class CalculatorModel {
	private int value1;
	private int value2;
	private int value_final;
	private String operation;
	public CalculatorModel()
	{
		this.value1=0;
		this.value2=0;
		this.value_final=0;
	}
	public int getValue1() {
		return value1;
	}
	public int getValue2() {
		return value2;
	}
	public String getOperation() {
		return this.operation;
	}
	public int getFinalValue()
	{
		return this.value_final;
	}
	public void setValue1(int value) {
		this.value1 = value;
	}
	public void setValue2(int value) {
		this.value2 = value;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public void setFinalVal(int value) {
		this.value_final= value;
	}
	
	public void addValue()
	{
		this.value_final = this.value1 + this.value2;
	}
	
	public void minusValue()
	{
		this.value_final = this.value1 - this.value2;
	}
	
	public void mulValue()
	{
		this.value_final = this.value1 * this.value2;
	}
	
	public void divValue()
	{
		this.value_final = this.value1 / this.value2;
	}
	
	public void reset()
	{
		this.value_final = 0;
	}
	
}
