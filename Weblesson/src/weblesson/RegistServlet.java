package weblesson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res)
		throws ServletException,IOException{
			req.setCharacterEncoding("UTF-8"); //文字化け対策

			String english = req.getParameter("english");
			String japanese = req.getParameter("japanese");
			


		ArrayList<Word> words = new ArrayList<>();
		WordDAO dao = new WordDAO();
		Word word1 = new Word(english,japanese);
		words.add(word1);
		int saveCount = dao.registWords(words);



		List<Word> wList = new ArrayList<>();
		wList =dao.getWords();

		int wordNum = 0;
		for(Word tmp : wList){
			System.out.println(tmp);
			wordNum++;
		}

		req.setAttribute("registCount",saveCount);
		req.setAttribute("wordsCount",wordNum);
		req.getRequestDispatcher("result.jsp").forward(req,res);
	}
}
