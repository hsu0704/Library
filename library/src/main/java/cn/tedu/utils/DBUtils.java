package cn.tedu.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	private static BasicDataSource bds;
	static {
		Properties pp=new Properties();
		InputStream is=DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			pp.load(is);
			String driver=pp.getProperty("driver");
			String url=pp.getProperty("url");
			String user=pp.getProperty("username");
			String password=pp.getProperty("password");
			bds=new BasicDataSource();
			bds.setDriverClassName(driver);
			bds.setUrl(url);
			bds.setUsername(user);
			bds.setPassword(password);
			bds.setMaxActive(5);
			bds.setInitialSize(3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() throws Exception{
		Connection conn=bds.getConnection();
		return conn;
	}

}
