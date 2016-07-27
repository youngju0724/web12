package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/audioGuide.do")
public class AudioGuideController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AudioGuideController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   request.setCharacterEncoding("utf-8");
		      /*
		      ArrayList<EmployeeVO> employeeList = new ArrayList<EmployeeVO>();
		      
		      EmployeeDAO dao = new EmployeeDAO();
		      employeeList = dao.selectEmployeeList();
		      
		      request.setAttribute("employeeList", employeeList);

		      RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
		      rd1.forward(request, response);
		      */
	}
	
	public void reqFileToDAO() {
		
	}
	
	public void reqScript() {
		
	}
	
	public void reqGps() {
		
	}
	
	public void searchSpot() {
		
	}
	
	public void checkPlay() {
		
	}
	
	public void reqSaveToDevice() {
		
	}
	
	public void reqFileToDevice() {
		
	}
}
