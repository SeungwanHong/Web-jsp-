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

import hsw.vo.user.LoginVo;

@WebServlet("/")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MainController() {
        super();
    }
    @Override
	public void init() throws ServletException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인이 되어있는지 검사 - 이후 처리는 리다이랙팅 처리
		//로그인이 되어있으면 게시판 목록페이지로 이동
		//로그인이 안되어 있으면 로그인 페이지로 이동
		response.sendRedirect("/User/login");
//		HttpSession session = null;
//		response.setCharacterEncoding("euc-kr");
//		LoginVo loginVo = (LoginVo)session.getAttribute("LOGIN");
//
//		if(loginVo == null){ 
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/User/login");
//			dispatcher.forward(request, response);
//		}else{
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/Board/list");
//			dispatcher.forward(request, response);
//		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
