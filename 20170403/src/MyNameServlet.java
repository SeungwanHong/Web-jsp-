

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyNameServlet")
//여기에 적어 놓으면 url 매핑이 알아서 처리된다.
public class MyNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyNameServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("EUC-KR");
		PrintWriter myname = response.getWriter();
		myname.append("<html>").append("<head>").append("<title>").append("마이네임").
		append("</title>").append("</head>").append("<body>").
		append("<h1>홍승완</h1>").append("</body>").append("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
