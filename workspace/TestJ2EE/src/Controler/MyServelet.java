package Controler;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.EleveBean;

@WebServlet("/MyServelet")
public class MyServelet extends HttpServlet {
	EleveBean eleve = new EleveBean();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		eleve.prenom = "bob";
		eleve.note = 15;

		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		req.setAttribute("eleve", eleve);
		getServletContext().getRequestDispatcher("/WEB-INF/MyJsp.jsp").forward(req, resp);

	}

}
