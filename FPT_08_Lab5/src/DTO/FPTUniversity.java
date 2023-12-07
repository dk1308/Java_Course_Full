package DTO;

import Role.Role;

public class FPTUniversity extends University implements Role{

	private String address;
	public FPTUniversity()
	{
		
	}
	public FPTUniversity(int size, String name, String address)
	{
		super(size, name);
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return this.name+" has four campuses Hanoi HCM, DaNang, CanTho, QuyNhon";
	}
	@Override
	public void createWorker() {
		// TODO Auto-generated method stub
		System.out.println("providing human resources");
	}

}
