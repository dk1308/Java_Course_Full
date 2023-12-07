import java.util.Objects;

public class SetAndGet {
	private int day;
	private int month;
	private int year; 
	
	public SetAndGet(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
//	1. Day
	public int getDay()
	{
		return this.day;
	}
	
	public void setDay(int d)
	{
		if(d >=1 && d <=31)
			this.day = d;
	}
//	2. Month
	public int getMonth()
	{
		return this.month;
	}
	
	public void setMonth(int m)
	{
		if(m >=1 && m <=12)
			this.month = m;
	}
//	3. Year
	public int getYear()
	{
		return this.year;
	}
	
	public void setYear(int y)
	{
		if(y >=1)
			this.year = y;
	}
	
	
	
	
//	4. Total
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
//	5. Equal and hashCode
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		SetAndGet other = (SetAndGet) obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}
}
