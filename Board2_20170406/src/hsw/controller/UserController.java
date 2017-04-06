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
@WebServlet("/User/")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserService();
	RequestDispatcher dispatcher = null;

	private static final String LOGIN = "/login";
	private static final String LOGINPAGE = "/loginPage";
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String req_url = request.getPathInfo();
		PrintWriter pw = response.getWriter();
		pw.append("여기는 로그인 페이지");
		switch(req_url){
		case LOGINPAGE:
			pw.append("여기는 로그인 페이지");
			response.sendRedirect("../form/login_form.jsp");
			break;
		case LOGIN:
			pw.append("여기는 로그인 채크 리쿼스트");
			String userId = request.getParameter("userid");
			String userPw = request.getParameter("userpw");
			LoginVo loginVo = userService.login(userId, userPw);
			if(loginVo != null){
				//로그인이 된 상태 - 리다이렉트로 처리     보통은 페이지가 들어가지 않고 컨트롤러의 주소가 들어간다.
				//LoginVO가 존재 한다 : 로그인이 성공 했다.
				// 로그인이 성공된 결과물을 세션에 저장해서 이 클라이언트가 웹사이트를 이용하는 동안
				// 로그인이 되어진 상태로 여러가지 작업을 할 수 있게 해 주자
				
				//Session : HttpSession 인터페이스를 기반으로 한다.
				HttpSession session = request.getSession();
				// session에 객체(값) 저장하기
				session.setAttribute("LOGIN", loginVo);
				response.sendRedirect("../example/login_form.jsp");
				
			}else{
				//로그인 안된 상태 - 포워딩으로 처리
				//로그인 요청을 했는데 로그인 안됫다는 처리는
				//리쿼스트가 유지가되있는 상태
				dispatcher = request.getRequestDispatcher("../example/login_failed.jsp");
				dispatcher.forward(request, response);
			}
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}