package weblesson;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res)
		throws ServletException,IOException{
			req.setCharacterEncoding("UTF-8"); //文字化け対策

			String english = req.getParameter("english");
			String japanese = req.getParameter("japanese");
			




			Word wd = new Word(english, japanese);
			WordDAO wdao = new WordDAO();

			int count = wdao.registWords(wd);
			req.setAttribute("count", count);

			HttpSession session = req.getSession(true);
			session.setAttribute("english", english);
			session.setAttribute("japanese", japanese);

			req.getRequestDispatcher("result.jsp").forward(req, res);
		}
}
