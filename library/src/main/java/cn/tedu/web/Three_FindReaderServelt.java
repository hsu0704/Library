package cn.tedu.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.context.Context;

import cn.tedu.dao.Three_BookDao;
import cn.tedu.dao.Three_ReaderDao;
import cn.tedu.entity.Three_Book;
import cn.tedu.entity.Three_Reader;
import cn.tedu.utils.ThyUtils;

/**
 * Servlet implementation class Three_FindReaderServelt
 */
public class Three_FindReaderServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reader=request.getParameter("reader");
		String finder=request.getParameter("finder");
		Three_ReaderDao dao=new Three_ReaderDao();
		Three_Reader r=dao.find(reader,finder);
		Context context=new Context();
		Three_BookDao dao1=new Three_BookDao();
		//更具读者知道最近借的一本数
		Three_Book b=dao1.find(finder);
		context.setVariable("b",b);
		context.setVariable("r", r);
		ThyUtils.write("../First-three", response, context);


	}


}
