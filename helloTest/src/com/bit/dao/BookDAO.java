package com.bit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.bit.vo.BookVO;
import com.bit.vo.ConnectionProvider;

public class BookDAO {
	public ArrayList<BookVO> listBook() {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		try {
			String sql = "select * from book";
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new BookVO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
			ConnectionProvider.close(rs, st, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
