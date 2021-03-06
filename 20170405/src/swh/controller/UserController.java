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
					//로그인 상태
					response.sendRedirect("/web_20170405/example/login_success.jsp");
				}else{
					//로그인 안된 상태 - 포워딩으로 처리
					//로그인 요청을 했는데 로그인 안됫다는 처리는
					//리쿼스트가 유지가되있는 상태
					RequestDispatcher dispatcher = request.getRequestDispatcher("/example/login_failed.jsp");
					dispatcher.forward(request, response);
				}
				break;
			case JOIN:
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
