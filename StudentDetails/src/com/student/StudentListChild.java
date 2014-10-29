package com.student;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class StudentListChild 
{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private com.google.appengine.api.datastore.Key key;
	
	@Persistent
	private String department;
	
	@Persistent
	private String college;
	
	@Persistent
	private String location;
	
	void setDepartment(String department)
	{
		this.department=department;
	}
	
	void setCollege(String college)
	{
		this.college=college;
	}
	
	void setLocation(String location)
	{
		this.location=location;
	}
	
	String getDepartment()
	{
		return department;
	}
	
	String getCollege()
	{
		return college;
	}
	String getLocation()
	{
		return location;
	}
	
	
	
	

}
