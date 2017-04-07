package hsw.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hsw.comm.Controller;
import hsw.comm.Key;
import hsw.comm.Page;
import hsw.comm.Url;
import hsw.service.UserService;
import hsw.service.impl.UserServiceImpl;
import hsw.vo.user.LoginVo;

@WebServlet(Controller.CONTROLLER_USER)

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();
	RequestDispatcher dispatcher = null;
	private HttpSession session;
	
	
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String req_url = request.getPathInfo();
		switch(req_url){
		case Url.URI_LOGINPAGE:
			//뷰 이동
			session = request.getSession();
			dispatcher = request.getRequestDispatcher(Page.PAGE_USER_LOGIN);
			dispatcher.forward(request, response);			
			break;
		case Url.URI_LOGINCHECK:
			String userId = request.getParameter("UserId");
			String userPw = request.getParameter("UserPw");
			boolean loginChk = userService.loginCheck(userId, userPw);
			if(loginChk){
				//세션을 남기고
				session = request.getSession();
				session.setAttribute(Key.KEY_LOGIN_SESSION, userId);
				//테스트
//				dispatcher = request.getRequestDispatcher(Page.PAGE_USER_LOGIN);
//				dispatcher.forward(request, response);
				//컨트롤 인가
				response.sendRedirect(Url.URL_FULL_BOARDLIST);
			}else{
				//뷰이동
				dispatcher = request.getRequestDispatcher(Page.PAGE_USER_LOGIN);
				dispatcher.forward(request, response);
			}
			break;
		case Url.URI_LOGOUT:
			//세션 지우고
			request.getSession().invalidate();
			//페이지 이동
			response.sendRedirect(Url.URI_MAIN);
			//페이지 이동
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
