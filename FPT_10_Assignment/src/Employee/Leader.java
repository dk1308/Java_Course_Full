package Employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Leader extends Employee{
	private int reviewTaskNumber;
	private int supportTaskNumber;
	private long allowance;
	
	public Leader()
	{
		this.role = 2;
		this.workStartingDate = new Date();
	}
	
	
	public int getReviewTaskNumber() {
		return reviewTaskNumber;
	}

	public void setReviewTaskNumber(int reviewTaskNumber) {
		this.reviewTaskNumber = reviewTaskNumber;
	}

	public int getSupportTaskNumber() {
		return supportTaskNumber;
	}

	public void setSupportTaskNumber(int supportTaskNumber) {
		this.supportTaskNumber = supportTaskNumber;
	}

	public long getAllowance()
	{
		return allowance;
	}

	public void setAllowance(long allowance)
	{
		this.allowance=allowance;
	}
	
	
	
	//	-----Hàm tính monthlyIncome
	@Override
	public void calMonthlyIncome() {
		this.monthlyIncome = (this.reviewTaskNumber * 4000000) + (this.supportTaskNumber * 400000) + this.rewardSalary + this.allowance;
	}

	
	
	
	//	-----Hàm tính allowance
	public void calAllowance()
	{
		Date current_date = new Date(System.currentTimeMillis());
		if(((current_date.getYear() - this.workStartingDate.getYear()==3) && (current_date.getMonth() - 
				this.workStartingDate.getMonth( )>= 36)) || (current_date.getYear() - this.workStartingDate.getYear()>3))
		{
			this.allowance =(long) (2000000*this.productivityScore);
		} else this.allowance = (long) (1200000*this.productivityScore);
	}
	
	
	
	
	//	-----Hàm toString
	@Override
	public String toString() {
		return this.role+","+this.empId+","+this.account+","+new SimpleDateFormat("dd/MM/yyyy").format(this.workStartingDate)
		+","+(double)Math.round(this.productivityScore*100)/100+","+this.reviewTaskNumber+","+this.supportTaskNumber;
	}
	
	@Override
	public String toString(boolean isCalMoney) {
		return this.role+","+this.empId+","+this.account+","+new SimpleDateFormat("dd/MM/yyyy").format(this.workStartingDate)
		+","+(double)Math.round(this.productivityScore*100)/100+","+this.reviewTaskNumber+","+this.supportTaskNumber+","+rewardSalary+","+monthlyIncome+","+allowance;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
