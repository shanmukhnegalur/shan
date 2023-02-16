package shan;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Student;
import dto.Sample;
@WebServlet("/fetch")
public class Controller4 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String s1=req.getParameter("stdid");
		int stdid=Integer.parseInt(s1);
		
		Sample s8=new Sample();
	String s=s8.fetch(stdid);
	resp.getWriter().println(s);
	}

}
