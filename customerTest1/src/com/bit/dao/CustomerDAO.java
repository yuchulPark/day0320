package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bit.vo.ConnectionProvider;
import com.bit.vo.CustomerVO;

@Repository
public class CustomerDAO {
	public ArrayList<CustomerVO> listCustomer(){
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		try {
			String sql = "select * from customer";
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				list.add(new CustomerVO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			ConnectionProvider.close(rs, st, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public CustomerVO getCustomer(int custid) {
		CustomerVO vo = null;
		try {
			String sql = "select * from customer where custid=?";
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo = new CustomerVO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			ConnectionProvider.close(rs,ps,conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public int insertCustomer(CustomerVO vo) {
		int re = -1;
		try {
			String sql = "insert into customer values(?,?,?,?)";
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getCustid());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getAddr());
			ps.setString(4, vo.getPhone());
			re = ps.executeUpdate();
			ConnectionProvider.close(null, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	public int updateCustomer(CustomerVO vo) {
		int re = -1;
		try {
			String sql = "update customer set name=?, address=?, phone=? where custid=?";
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAddr());
			ps.setString(3, vo.getPhone());
			ps.setInt(4, vo.getCustid());
			re = ps.executeUpdate();
			ConnectionProvider.close(null, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	public int deleteCustomer(int custid) {
		int re = -1;
		try {
			String sql = "delete customer where custid = ?";
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custid);
			re = ps.executeUpdate();
			ConnectionProvider.close(null, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
}
