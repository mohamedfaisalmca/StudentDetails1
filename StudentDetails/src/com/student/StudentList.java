package com.student;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class StudentList 
{
	//this is faisal
	//this is my first change
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private com.google.appengine.api.datastore.Key key;
	
	@Persistent
	private String name;
	
	@Persistent
	private int rollNo;
	
	@Persistent(dependent="true")
	private StudentListChild studentlistchild;
	
	//set method
	void setName(String name) 
	{
		this.name=name;
	}
	void setRollno(int rollno)
	{
		this.rollNo=rollno;
	}
	
	void setStudentListChild(StudentListChild slc)
	{
		this.studentlistchild=slc;
	}
	void setKey(com.google.appengine.api.datastore.Key key)
	{
		this.key=key;
	}
	
	//get method
	String getName()
	{
		return name;
	}
	int getRollno()
	{
		return rollNo;
	}
	StudentListChild getStudentListChild()
	{
		return studentlistchild;
	}
}
