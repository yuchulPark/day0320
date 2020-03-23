package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.vo.MemberVO;

public class MemberDAO {
	public ArrayList<MemberVO> listAll(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			String sql = "select * from member";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","c##madang","madang");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new MemberVO(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
			}
			if(rs != null) {
				rs.close();
			}
			if(st != null) {
				st.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
