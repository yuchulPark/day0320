package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.vo.ConnectionProvider;
import com.bit.vo.GoodsVO;

public class GoodsDAO {
	public static int totalRecord;
	public static int pageSIZE=4;
	public static int totalPage;
	public static int pageGroup=5;
	
	public int getTotalRecord() {
		int n = 0;
		String sql = "select count(*) from goods";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				n = rs.getInt(1);
			}
			ConnectionProvider.close(rs, st, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	public int deleteGoods(int no) {
        int re = -1;
        String sql = "delete goods where no=?";
        try {
            Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, no);
            re = pstmt.executeUpdate();
            ConnectionProvider.close(null, pstmt, conn);
        }catch (Exception e) {
        	e.printStackTrace();
        }
        return re;
    }
	public int updateGoods(GoodsVO vo) {
        int re = -1;
        String sql = "update goods set item=?,price=?,qty=?,fname=?,detail=? where no=?";
        try {       
            Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
            PreparedStatement pstmt = conn.prepareStatement(sql);           
            pstmt.setString(1, vo.getItem());
            pstmt.setInt(2, vo.getPrice());
            pstmt.setInt(3, vo.getQty());
            pstmt.setString(4, vo.getFname());
            pstmt.setString(5, vo.getDetail());
            pstmt.setInt(6, vo.getNo());
            re = pstmt.executeUpdate();
            ConnectionProvider.close(null, pstmt, conn);
        }catch (Exception e) {
        	e.printStackTrace();
        }
        return re;
    }
	public GoodsVO getGoods(int no) {
        GoodsVO vo = new GoodsVO();
        String sql = "select * from goods where no=?";
        try {
            Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, no);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
            	vo.setNo(no);
            	vo.setItem(rs.getString(2));
            	vo.setPrice(rs.getInt(3));
            	vo.setQty(rs.getInt(4));
            	vo.setFname(rs.getString(5));
            	vo.setDetail(rs.getString(6));
            }ConnectionProvider.close(rs, pstmt, conn);
        }catch (Exception e) {
        	e.printStackTrace();
        }
        return vo;
    }
	public int insertGoods(GoodsVO vo) {
        int re = -1;
        try {
            String sql = "insert into goods values(seq_goods.nextval,?,?,?,?,?)";
            Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
            PreparedStatement pstmt = conn.prepareStatement(sql);           
            pstmt.setString(1, vo.getItem());
            pstmt.setInt(2, vo.getPrice());
            pstmt.setInt(3, vo.getQty());
            pstmt.setString(4, vo.getFname());
            pstmt.setString(5, vo.getDetail());
            re = pstmt.executeUpdate();
            ConnectionProvider.close(null, pstmt, conn);
        }catch (Exception e) {
        	e.printStackTrace();
        }
        return re; 
    }
	public ArrayList<GoodsVO> listAll(int pageNUM){
		totalRecord = getTotalRecord();
		totalPage = (int)Math.ceil(totalRecord/pageSIZE);
		int start = (pageNUM - 1) * pageSIZE + 1;
		int end = start + pageSIZE - 1;
		if(end > totalRecord) {
			end = totalRecord;
		}
		ArrayList<GoodsVO> list = new ArrayList<GoodsVO>();
		try {
			String sql = "select no,item,price,qty,fname,detail from (select rownum n, no,item,price,qty,fname,detail from (select * from goods order by no)) where n between ? and ?";
            Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, start);
            pstmt.setInt(2, end);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                list.add(new GoodsVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), 			rs.getString(5), rs.getString(6)));
            }ConnectionProvider.close(rs, pstmt, conn);         
        }catch (Exception e) {
        	e.printStackTrace();
        }
		return list;
	}
}
