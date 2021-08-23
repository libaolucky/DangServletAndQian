package com.hp.dao.lxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hp.entity.lxy.Book;
import com.hp.util.lxy.DBHelper;

public class BookDaoImpl implements BookDao{

	@Override  //全查
	public ArrayList<Book> selectAll() {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		ArrayList<Book> list = new ArrayList<Book>();
		try {
			con=DBHelper.getConn();
			String sql2="select * from book order by rand() limit 2";
			ps=con.prepareStatement(sql2);
			ResultSet rs=ps.executeQuery(); 
			 Book b=null;
			while(rs.next()){
				b=new Book(
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getInt(5),
						rs.getDouble(6),
						rs.getString(7),
						rs.getDouble(8),
						rs.getInt(9),
						rs.getString(10),
						rs.getString(11),
						rs.getString(12),
						rs.getDate(13),
						rs.getString(14),
						rs.getString(15),
						rs.getDate(16),
						rs.getString(17),
						rs.getString(18),
						rs.getInt(19),
						rs.getString(20),
						rs.getString(21),
						rs.getString(22),
						rs.getString(23),
						rs.getString(24),
						rs.getInt(25)
						); 
				list.add(b);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(ps, con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return list;
	}

}
