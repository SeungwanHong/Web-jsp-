package hsw.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/*")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MainController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//로그인이 되어있는지 검사 - 이후 처리는 리다이랙팅 처리
		//로그인이 되어있으면 게시판 목록페이지로 이동
		//로그인이 안되어 있으면 로그인 페이지로 이동
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
