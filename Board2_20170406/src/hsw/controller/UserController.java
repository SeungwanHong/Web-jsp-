package hsw.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hsw.service.UserService;
import hsw.vo.user.LoginVo;
@WebServlet("/User/*")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserService();
	RequestDispatcher dispatcher = null;

	private static final String LOGINPAGE = "/login";
	private static final String LOGINCHECK = "/loginchk";
	
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String req_url = request.getPathInfo();
		PrintWriter pw = response.getWriter();
		pw.println(req_url);
		switch(req_url){
		case LOGINPAGE:
			dispatcher = request.getRequestDispatcher("../form/login_form.jsp");
			dispatcher.forward(request, response);
			break;
		case LOGINCHECK:
			userService.login(id, pw);
			dispatcher = request.getRequestDispatcher("../form/login_form.jsp");
			dispatcher.forward(request, response);
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
