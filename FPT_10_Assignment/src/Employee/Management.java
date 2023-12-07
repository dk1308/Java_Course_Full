	package Employee;
	
	import java.text.SimpleDateFormat;
	import java.util.Date;
	
	public class Management extends Employee{
		private int resolveIssueNumber;
		private int otherTaskNumber;
		private long allowance;
		
		public Management()
		{
			super();
			this.role = 1;
			this.workStartingDate = new Date();
		}
		
		
		
		public int getResolveIssueNumber() {
			return resolveIssueNumber;
		}
	
		public void setResolveIssueNumber(int resolveIssueNumber) {
			this.resolveIssueNumber = resolveIssueNumber;
		}
	
		public int getOtherTaskNumber() {
			return otherTaskNumber;
		}
	
		public void setOtherTaskNumber(int otherTaskNumber) {
			this.otherTaskNumber = otherTaskNumber;
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
			this.monthlyIncome =  this.getResolveIssueNumber()*5000000+(this.getOtherTaskNumber()*500000) + this.getRewardSalary()+ this.getAllowance();
		}
	
		public long getMonthlyIncome()
		{
			return this.monthlyIncome;
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
		
		
		
		
	//	-----Hàm toSring 
		@Override
		public String toString() {
			return this.role+","+this.empId+","+this.account+","+new SimpleDateFormat("dd/MM/yyyy").format(this.workStartingDate)
			+","+(double)Math.round(this.productivityScore*100)/100+","+this.resolveIssueNumber+","+this.otherTaskNumber;
		}
		
		@Override
		public String toString(boolean isCalMoney)
		{
			return this.role+","+this.empId+","+this.account+","+new SimpleDateFormat("dd/MM/yyyy").format(this.workStartingDate)
			+","+(double)Math.round(this.productivityScore*100)/100+","+this.resolveIssueNumber+","+this.otherTaskNumber+","+this.rewardSalary+","+this.monthlyIncome+","+this.allowance; 
		}
	
	
	
		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
