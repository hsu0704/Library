package cn.tedu.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.context.Context;

import cn.tedu.utils.ThyUtils;

/**
 * Servlet implementation class StartServlet
 */
public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ThyUtils.write("First", response, new Context());
	}

}
