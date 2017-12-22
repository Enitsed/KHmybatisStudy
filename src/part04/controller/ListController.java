package part04.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import part04.dao.MemDAO;
import part04.dto.MemDTO;

@WebServlet("/myList")
public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proceed(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proceed(req, resp);
	}

	private void proceed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("view/list.jsp");
		MemDAO dao = new MemDAO();
		List<MemDTO> aList = dao.allMethod();
		String[] valList = req.getParameterValues("chk");
		if(valList!=null) {
			dao.deleteMethod(valList);
		}
		req.setAttribute("aList", aList);
		dispatcher.forward(req, resp);
	}

}
