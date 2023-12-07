import java.util.Date;

public class FuCached {
	Object object;
	Date expiredDate;
	
	public FuCached(Object object, Date expiredDate) {
		this.object = object;
		this.expiredDate = expiredDate;
	}
	public FuCached() {
		
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	@Override
	public String toString() {
		return this.object+"";
	}
	
}
