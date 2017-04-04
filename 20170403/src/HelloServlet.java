

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//클라이언트의 요청을 url을 통해서 받는다.
//때문에 사용자의 요청에 해당하는 url을 해당 서블릿에 매핑(Mapping)한다.
//web.xml 에서 서블릿과 해당하는 url을 매핑 한다.
//*매핑 : 사용자가 ~url 을 요청 했으면 해당 서블릿 기능을 사용하겠다~
@WebServlet("/HelloServelt")
//여기에 적어 놓으면 url 매핑이 알아서 처리된다.
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }
    //무조건 url을 통해서(기본)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("HelloServlet 호출");
		//클라이언트에게 응답
		response.setCharacterEncoding("EUC-KR");
		//서블릿만 사용하던 시절
		PrintWriter pw = response.getWriter();
		pw.append("<html>").append("<head>").append("<title>").append("hello").
		append("</title>").append("</head>").append("<body>").
		append("<h1>hello page</h1>").append("</body>").append("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
