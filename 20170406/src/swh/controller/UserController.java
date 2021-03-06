package swh.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import swh.service.UserService;
import swh.user.vo.LoginVO;

//요청한 url이 user가 잇으면 여기서 처리
@WebServlet("/user/*")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserService();




	private static final String LOGIN = "/login";
	private static final String JOIN = "/join";
	private static final String LOGOUT = "/logout";

    public UserController() {
        super();
    }
    //UserController 서블릿이 최초에 만들어 질 때 딱 한번만 호출 된다.
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//제일 마지막에 입력된 url 가져오기 request.getPathInfo();

		// ex) /user/login -> /login
		//	   /user/join  -> /join
		String req_uri = request.getPathInfo();
		try {
			switch(req_uri){
			//클라이언트가 login 요청을 했으면
			case LOGIN:
				//클라이언트가 form에 입력해서 전송한 id와 pw를 받아 낸다.
				String userId = request.getParameter("userid");
				String userPw = request.getParameter("userpw");
				LoginVO loginVo = userService.login(userId, userPw);
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
					RequestDispatcher dispatcher = request.getRequestDispatcher("../example/login_failed.jsp");
					dispatcher.forward(request, response);
				}
				break;
			case JOIN:
				break;
			case LOGOUT:
				//세션 초기화
				request.getSession().invalidate();
				response.sendRedirect("../example/login_form.jsp");
				break;
			}
		}catch (SQLException e) {
			throw new ServletException(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
