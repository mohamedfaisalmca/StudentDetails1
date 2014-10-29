package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.KeyFactory;

public class StudentDeleteServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException 
	{
		PersistenceManager pm=PMF.get().getPersistenceManager();
		
		PrintWriter out=resp.getWriter();
		
		int rollNo=Integer.parseInt(req.getParameter("rollNo"));
		try
		{
			com.google.appengine.api.datastore.Key k = KeyFactory.createKey(StudentList.class.getSimpleName(), rollNo);
		    StudentList studList = pm.getObjectById(StudentList.class, k);
		    
		    pm.deletePersistent(studList);
		    out.println("Data has successfully deleted");
		}
		catch(Exception e)
		{
			out.println("Sorry, Data hasn't found in datastore to delete the record.");
		}
	}
}
