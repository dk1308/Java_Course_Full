package DTO;

import Role.Role;

public class BeeColony extends Colony implements Role{

	private String type;
	public BeeColony()
	{
		
	}
	public BeeColony(int size, String place, String type)
	{
		super(size, place);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	@Override
	public String toString() {
		return "the colony’s type is " +this.type + ", size is about " + this.size + ", and the place is " + this.place;
	}
	@Override
	public void createWorker() {
		// TODO Auto-generated method stub
		System.out.println("Worker bees perform all the work of the bees");
	}

}
