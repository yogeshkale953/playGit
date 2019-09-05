package com;

public class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
@Override
public boolean equals(Object obj) {

	if(this==obj)
	{
		return true;
	}
	if(obj==null || obj.getClass()!=this.getClass())
	{
		return false;
				
	}
	
	Student s=(Student)obj;
	
	return (s.name.equals(this.name) && s.id==this.id);
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return this.id;
}
}
