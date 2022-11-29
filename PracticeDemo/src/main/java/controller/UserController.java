package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import UserModel.User;
import DAOClass.*;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("register")) {
			User u =new User();
			
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			DAOClass.insertUser(u);
			response.sendRedirect("login.jsp");
			
		}
		else if(action.equalsIgnoreCase("login")) {
			User u =new User();
			
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			
			String email=request.getParameter("email");
			boolean flag=DAOClass.checkEmail(email);
			
			if(flag==true) {
				User u1=DAOClass.loginUser(u);
					if(u1==null) {
						request.setAttribute("msg1", "incorrect password !!!");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
					else {
						HttpSession session=request.getSession();
						session.setAttribute("data", u1);
						request.getRequestDispatcher("home.jsp").forward(request, response);
					}
			}
			else {
				request.setAttribute("msg", "Email id not registered !!!");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		}
		
		
	}

}