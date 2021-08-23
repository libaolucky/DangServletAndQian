package com.hp.dao.lxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hp.entity.lxy.User;
import com.hp.util.lxy.DBHelper;

public class UserDaoImpl implements UserDao{

	@Override  //登录
	public User selectE(String email) {
		// TODO Auto-generated method stub
		User user=null;
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;

		try {
			conn=DBHelper.getConn();
			String sql="select * from user where email=?";
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, email);
			  rs=pstm.executeQuery();
			 System.out.println(rs);
			 
		while(rs.next()){
			System.out.println("---------------------");
				user=new User(
				  rs.getInt(1),
				  rs.getString(2),
				  rs.getString(3),
				  rs.getString(4)
					);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(rs, pstm, conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return user;
	}

	@Override
	public int zhuce(String email,String username, String password) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection conn = null;
		PreparedStatement ps=null;
		try {
			conn=DBHelper.getConn();
			String sql1 = "insert into user(email,username,password) values (?,?,?)";
			ps=conn.prepareStatement(sql1);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, password);
			i=ps.executeUpdate();
			System.out.println(i);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(ps, conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
}
