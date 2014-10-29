package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.KeyFactory;
import com.sun.jndi.cosnaming.IiopUrl.Address;

//import com.relationship.PMF;

@SuppressWarnings("serial")
public class StudentDetailsServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException 
	{
		resp.setContentType("text/html");
		StudentList sl=new StudentList();
		StudentListChild slc=new StudentListChild();
		
		PersistenceManager pm=PMF.get().getPersistenceManager();
		
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		int rollNo=Integer.parseInt(req.getParameter("rollNo"));		
		String department=req.getParameter("department");
		String collegeName=req.getParameter("collegeName");
		String location=req.getParameter("location");
		
		com.google.appengine.api.datastore.Key key=KeyFactory.createKey(StudentList.class.getSimpleName(),rollNo );
		
		//parent class set method calling
		sl.setName(name);
		sl.setRollno(rollNo);
		sl.setStudentListChild(slc);
		sl.setKey(key);
		sl.getStudentListChild().setCollege(collegeName);
		sl.getStudentListChild().setDepartment(department);
		sl.getStudentListChild().setLocation(location);
		
		pm.makePersistent(sl);	
		
		out.println("<html><body>"
				+ "<br><br>your data has successfully saved into datastore.. <br>"
				+ "<br>"
				+ "<b>Name</b> and <b>Roll Number</b> has saved in one table. That table name called <b>AddressList</b><br>"
				+ "<b>Department Name</b>,<b>College name</b> and <b>Location</b> in another table called <b>AddressListChild</b>"
				+ "<br><b>Owned one to one relationship is maintaining</b> ");
		//out.println("Your data has saved successfully");
		
	}
}
