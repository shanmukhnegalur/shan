package shan;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Student;
import dto.Sample;

@WebServlet("/bd")
public class Controller1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String s1=req.getParameter("stdid");
		int stdid=Integer.parseInt(s1);
		String stdname=req.getParameter("stdname");
		
		Student std1=new Student();
		std1.setStdid(stdid);
		std1.setStdname(stdname);
		
		Sample s5=new Sample();
		s5.update(stdid, stdname);
	}

	

}
