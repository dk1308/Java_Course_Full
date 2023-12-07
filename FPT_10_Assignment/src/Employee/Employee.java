package Employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Employee implements Comparable<Employee>{
	String empId;
	String account;
	int role;
	Date workStartingDate;
	double productivityScore;
	long monthlyIncome;
	long rewardSalary;
	
	public Employee() {

	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public Date getWorkStartingDate() {
		return workStartingDate;
	}

	public void setWorkStartingDate(Date workStartingDate) {
		this.workStartingDate = workStartingDate;
	}

	public double getProductivityScore() {
		return productivityScore;
	}

	public void setProductivityScore(double productivityScore) {
		this.productivityScore = productivityScore;
	}

	public long getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(long monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public long getRewardSalary() {
		return rewardSalary;
	}

	public void setRewardSalary(long rewardSalary) {
		this.rewardSalary = rewardSalary;
	}

	public abstract void calMonthlyIncome();

	public abstract String toString(boolean isCalMoney);
	
	public void calReward()
	{
		this.rewardSalary = (int)(this.productivityScore*3000000);
	}
	
	
	public void setInfor(int role,String empId,String account,Date workStartingDate,double productivityScore) {
		this.role = role;
		this.empId = empId;
		this.account = account; 
		this.workStartingDate = workStartingDate;
		this.productivityScore = productivityScore;
	}
	
	public String stringInfor()
	{
		return this.role+","+this.empId+","+this.account+","+new SimpleDateFormat("dd/MM/yyyy").format(this.workStartingDate)+","+this.productivityScore;
	}
}
