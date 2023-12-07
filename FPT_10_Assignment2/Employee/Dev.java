package Employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dev extends Employee{
	private int doneTaskNumber;
	
	public Dev()
	{
		this.role = 3;
		this.workStartingDate = new Date();
	}
	public void setDoneTaskNumber(int doneTaskNumber)
	{
		this.doneTaskNumber=doneTaskNumber;
	}
	public int getDoneTaskNumber()
	{
		return this.doneTaskNumber;
	}
	
	
	//	-----Hàm tính monthlyIncome	
	@Override
	public void calMonthlyIncome() {
		this.monthlyIncome = (doneTaskNumber * 1500000) + this.rewardSalary ;
	}

	
	
	//	-----Hàm toString
	@Override
	public String toString() {
		return this.role+","+this.empId+","+this.account+","+new SimpleDateFormat("dd/MM/yyyy").format(this.workStartingDate)
		+","+(double)Math.round(this.productivityScore*100)/100+","+this.doneTaskNumber;
	}
	
	@Override
	public String toString(boolean isCalMoney) {
		return this.role+","+this.empId+", "+this.account+","+new SimpleDateFormat("dd/MM/yyyy").format(this.workStartingDate)
				+","+(double)Math.round(this.productivityScore*100)/100+","+this.doneTaskNumber+","+rewardSalary+","+monthlyIncome;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	


}
