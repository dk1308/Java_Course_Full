import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FuMemoryCached {
	
	public HashMap<String,FuCached> cache = new HashMap<>();
	Date currentTime;
	
//	Hàm thêm object vào HashMap
	public boolean putObject(String key, Object object, int timeToLive)
	{
		Calendar expiredCalendar = Calendar.getInstance();
		expiredCalendar.setTime(new Date(System.currentTimeMillis()));
		expiredCalendar.add(expiredCalendar.MILLISECOND, timeToLive);
		
		FuCached newFuCached = new FuCached();
		newFuCached.setExpiredDate(expiredCalendar.getTime());
		newFuCached.setObject(object);
		if (isDupplicated(key)) {
			return false;
		} else {
			cache.put(key, newFuCached);
			System.out.println(newFuCached);
			return true;
		}
	}
	
//	Hàm lấy object từ HashMap
	public Object getObject(String key)
	{
		currentTime = new Date(System.currentTimeMillis());
		if (cache.containsKey(key)) {
			FuCached fuCached = cache.get(key);
			if (currentTime.compareTo(fuCached.getExpiredDate())<=0) {
				return fuCached;
			} else clean(key);  /* Nếu object hết hạn thì clean */
		} 
		return null;
	}
	
//	Hàm xóa 1 object từ Hashmap
	public boolean clean(String key)
	{
		if (cache.containsKey(key)) {
			cache.remove(key);
			return true;
		} else return false;
	}
	
//	Hàm xóa tất cả object trong Hashmap
	public boolean cleanAll()
	{
		Set<String> set = cache.keySet();
		if (cache != null) {
			for (String key : set) {
				cache.remove(key);
			}
			return true;
		} return false;
	}
	
	public boolean isDupplicated(String key)
	{
		if (cache.containsKey(key)) {
			return true;
		} else return false;
	}

	
}	
