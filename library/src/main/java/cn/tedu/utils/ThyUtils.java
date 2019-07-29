package cn.tedu.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ThyUtils {
	private static TemplateEngine te;
	static {
		//创建模版引擎对象
		te=new TemplateEngine();
		//创建解析器
		ClassLoaderTemplateResolver r=new ClassLoaderTemplateResolver();
		//设置解析器的字符集
		r.setCharacterEncoding("utf-8");
		//设置路径前缀
		r.setPrefix("../");
		//设置路径后缀
		r.setSuffix(".html");
		//解析器和模版引擎关联
		te.setTemplateResolver(r);
	}
	public static void write(String path,HttpServletResponse response,Context context) throws IOException {
		//把页面和数据给到模版引擎 生成新的html
		String html=te.process(path, context);
		//设置响应头
		response.setContentType("text/html;charset=utf-8");
		//获得输出异常 抛出
		PrintWriter pw= response.getWriter();
		pw.println(html);
		pw.close();
	}
}
