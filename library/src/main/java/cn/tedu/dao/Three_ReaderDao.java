package cn.tedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.tedu.entity.Three_Reader;
import cn.tedu.utils.DBUtils;

public class Three_ReaderDao {

	public Three_Reader find(String reader, String finder) {
		//获得数据库的连接
		try (Connection conn = DBUtils.getConn();) {
			String sql="select * from reader where readercarid=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(finder));
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int   readercarid = rs.getInt(1);
				String readername=rs.getString(2);
				String readertype=rs.getString(3);
				String readerid=rs.getString(4);
				int readerphoto=rs.getInt(5);
				Three_Reader t=new Three_Reader(readercarid, readername, readertype, readerid,readerphoto);
				return t;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return null;
	}

}
