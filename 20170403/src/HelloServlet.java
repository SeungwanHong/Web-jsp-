

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Ŭ���̾�Ʈ�� ��û�� url�� ���ؼ� �޴´�.
//������ ������� ��û�� �ش��ϴ� url�� �ش� ������ ����(Mapping)�Ѵ�.
//web.xml ���� ������ �ش��ϴ� url�� ���� �Ѵ�.
//*���� : ����ڰ� ~url �� ��û ������ �ش� ���� ����� ����ϰڴ�~
@WebServlet("/HelloServelt")
//���⿡ ���� ������ url ������ �˾Ƽ� ó���ȴ�.
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }
    //������ url�� ���ؼ�(�⺻)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("HelloServlet ȣ��");
		//Ŭ���̾�Ʈ���� ����
		response.setCharacterEncoding("EUC-KR");
		//������ ����ϴ� ����
		PrintWriter pw = response.getWriter();
		pw.append("<html>").append("<head>").append("<title>").append("hello").
		append("</title>").append("</head>").append("<body>").
		append("<h1>hello page</h1>").append("</body>").append("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
