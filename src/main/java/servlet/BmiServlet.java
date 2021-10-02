package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class BmiServlet extends GenericServlet{
	
//http://localhost:8080/JavaWeb20210918/servlet/bmi?h=170&w=60
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;chareset=uft-8");
		// TODO Auto-generated method stub
		
		//1.接收資料
		String height = req.getParameter("h");
		String weight = req.getParameter("w");					
		//2.處理計算
		double h=Double.parseDouble(height);
		double w=Double.parseDouble(weight);
		double bmi=w/Math.pow(h/100,2);
		
		//3.回應資料
		res.getWriter().print("BMI ="+bmi);		
	}

}
