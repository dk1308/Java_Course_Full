import java.io.Serializable;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Serializable {
	private String code;
	private String name;
	private int phone;
	public Customer(String code, String name, int phone) {
		this.code = code;
		this.name = name;
		this.phone = phone;
	}
	public Customer()
	{
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return  "Customer: " + code + ", " + name + ", " + phone;
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(code, other.code);
	}
	
	
	
	
}
