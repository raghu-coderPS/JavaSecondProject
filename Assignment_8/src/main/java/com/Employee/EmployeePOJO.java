package com.Employee;

public class EmployeePOJO {
	public EmployeePOJO(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}

	public String name;
	public String city;
	public int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getName() 
	{
		return name;
	}
	
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String toString()
	{
		return id+" "+name+" "+city;
		
	}
	

}
