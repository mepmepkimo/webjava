package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BmiService;


@WebServlet(value = { "/servlet/bmicalc" })
public class BmiCalcHttpServlet extends HttpServlet {

	private BmiService bmiService=new BmiService();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//取得參數資料
		String height=req.getParameter("height");
		String weight=req.getParameter("weight");
		//取得bmi結果
		double bmi = bmiService.getBmi(height, weight);
		
		
//		//轉型
//		double h = Double.parseDouble(height);
//		double w = Double.parseDouble(weight);
//		//計算bmi
//		double bmi =w/Math.pow(h/100,2);
//-------------------------計算完畢
		//透過jsp渲染資料
		//1. 建立分派器(並指定jsp)
		//2. 建立要送資料
		//3. 分派方式 forword, include
		RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/view/bmi_result.jsp");
		req.setAttribute("bmi", bmi);//建立一個request變數名叫 bmi 裡面放入bmi的計算結果
		rd.forward(req, resp);//重新導向

		
	}

}
