import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public LoginServlet() {
		System.out.println("Constractor");
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name);
		System.out.println(password);
		
		//�����ҳ����ת,�ڷ���˷����ļ�,�����ļ����ݷ��������
		/*if (name.equals("admin") && password.equals("123")) {
			System.out.println("Pass");
			request.getRequestDispatcher("success.html").forward(request, response);
		} else {
			System.out.println("Fail");
			request.getRequestDispatcher("fail.html").forward(request, response);
		}*/
		//�ͻ�����ת
		if (name.equals("admin") && password.equals("123")) {
			System.out.println("Pass");
			response.sendRedirect("success.html");
		} else {
			System.out.println("Fail");
			response.sendRedirect("fail.html");
		}
		
		//����html
		/*String html = null;
		if (name.equals("admin") && password.equals("123")) {
			System.out.println("Pass");
			html = "<div style='color:green'>�ɹ�</div>";
		} else {
			System.out.println("Fail");
			html = "<div style='color:red'>ʧ��</div>";
		}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println(html);*/
	}
}
