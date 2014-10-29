package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.KeyFactory;

public class StudentUpdateServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException 
	{
		//PrintWriter out=resp.getWriter();
		
		resp.setContentType("text/html");
		StudentList sl=new StudentList();
		StudentListChild slc=new StudentListChild();
		
		PersistenceManager pm=PMF.get().getPersistenceManager();
		
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		int rollNo=Integer.parseInt(req.getParameter("roll"));
		
		//out.println(rollNo);		
		String department=req.getParameter("department");
		String collegeName=req.getParameter("collegeName");
		String location=req.getParameter("location");
		
		com.google.appengine.api.datastore.Key key=KeyFactory.createKey(StudentList.class.getSimpleName(),rollNo );
		StudentList sll=pm.getObjectById(StudentList.class, key);
		sll.setName(name);
		sll.getStudentListChild().setDepartment(department);
		sll.getStudentListChild().setCollege(collegeName);
		sll.getStudentListChild().setLocation(location);
	
		pm.close();	
		out.println("Your record has deleted successfully");		
	}
}
