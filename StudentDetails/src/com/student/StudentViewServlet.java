package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.KeyFactory;
//import com.relationship.Employee;

@SuppressWarnings("serial")
public class StudentViewServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException 
	{
		PersistenceManager pm=PMF.get().getPersistenceManager();
		
		PrintWriter out=resp.getWriter();
		
		int rollNo=Integer.parseInt(req.getParameter("rollNo"));
		try
		{
			com.google.appengine.api.datastore.Key k = KeyFactory.createKey(StudentList.class.getSimpleName(), rollNo);		
	        
			StudentList es = pm.getObjectById(StudentList.class, k);
        
	        out.println("Name= "+es.getName());
	        out.println("Roll No= "+es.getRollno());
	        out.println("Department Name= "+es.getStudentListChild().getDepartment());
	        out.println("College Name= "+es.getStudentListChild().getCollege());        
	        out.println("Location Name= "+es.getStudentListChild().getLocation());	        
		}
		catch(Exception e)
		{
			out.println("Sorry, There is no record in given Roll number");
		}
	}
}
