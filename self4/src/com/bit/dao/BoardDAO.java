package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.vo.BoardVO;
import com.bit.vo.ConnectionProvider;

public class BoardDAO {
	public static int totalRecord; // 전체레코드 수를 저장하기 위한 변수
	public static int pageSIZE = 3; // 한 화면에 보여줄 레코드수를 제한하기 위한 변수
	public static int totalPage; // 전체 페이지 수를 저장하기 위한 변수
	public static int pageGROUP = 3; // 한 화면에 보여줄 페이지 수를 제한하기 위한 변수 
	
	public int getTotalRecord() { // 전체 레코드 수를 반환하기 위한 메소드
		int n = 0;
		try {
			String sql = "select count(*) from board";
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
	// 게시물 번호를 매개변수로 전달받아 해당 게시물의 조회수를 증가시키기 위한 메소드 정의
	public void updateHit(int no) {
		try {
			String sql = "update board set hit = hit + 1 where no =?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ps.executeUpdate();
			ConnectionProvider.close(null, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int updateBoard(BoardVO b) {
		int re = -1;
		try {
			String sql = "update board set title=?, content=?, fname=? where no=? and pwd =?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getTitle());
			ps.setString(2, b.getContent());
			ps.setString(3, b.getFname());
			ps.setInt(4, b.getNo());
			ps.setString(5, b.getPwd());
			re = ps.executeUpdate();
			ConnectionProvider.close(null, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		try {
			String sql = "delete board where no = ? and pwd = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ps.setString(2, pwd);
			re = ps.executeUpdate();
			ConnectionProvider.close(null, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	// 파일명을 매개변수로 전달받아 이미지 파일인지 판별하는 메소드
	public boolean isImage(String fname) {
		boolean re = false;
		if(fname != null) {
			fname = fname.toLowerCase();
			String arr[] = {".jpg",".gif",".png",".bmp",".jpeg"};
			for(int i = 0; i < arr.length; i++) {
				if(fname.endsWith(arr[i])) {
					re = true;
					break;
				}
			}
		}
		return re;
	}
	public BoardVO detailBoard(int no) {
		BoardVO b = new BoardVO();
		try {
			String sql = "select * from board where no = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString(2));
                b.setWriter(rs.getString(3));
                b.setPwd(rs.getString(4));
                b.setHit(rs.getInt(5));
                b.setRegidate(rs.getDate(6));
                b.setContent(rs.getString(7));
                b.setFname(rs.getString(8));
                b.setIp(rs.getString(9));
                b.setB_ref(rs.getInt(10));
                b.setB_level(rs.getInt(11));
                b.setB_step(rs.getInt(12));
			}
			ConnectionProvider.close(rs, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	public ArrayList<BoardVO> listAll(int pageNUM){
		totalRecord = getTotalRecord();
		totalPage = totalRecord / pageSIZE;
		if(totalRecord % pageSIZE != 0) {
			totalPage++;
		}
		System.out.println("전체 페이지 수 : " + totalPage);
		// 현재 페이지에 보여줄 시작레코드의 위치를 계산. 만약 전체레코드가 43개이고, 현재 페이지가 1페이지라면 시작레코드의 위치는 1, 만약 현재페이지가 2페이지라면 시작레코드의 위치는 11
		int start = (pageNUM - 1) * pageSIZE + 1;
		int end = start + pageSIZE - 1;
		if(end > totalRecord) {
			end = totalRecord;
		}
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		try {
			String sql = "select no, title, writer, pwd, hit, regidate, content, fname, ip, b_ref, b_level, b_step from " + 
					"(select rownum r, no, title, writer, pwd, hit, regidate, content, fname, ip, b_ref, b_level, b_step from " + 
							"(select * from board order by b_ref desc, b_step)) where r between ? and ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BoardVO b = new BoardVO();
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString(2));
                b.setWriter(rs.getString(3));
                b.setHit(rs.getInt(5));
                b.setRegidate(rs.getDate(6));
                b.setIp(rs.getString(9));
                b.setB_ref(rs.getInt(10));
                b.setB_level(rs.getInt(11));
                b.setB_step(rs.getInt(12));
                list.add(b);
			}
			ConnectionProvider.close(rs, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	// 새로운 글번호를 반환하는 메소드
	public int getNextNo() {
		String sql = "select nvl(max(no),0)+1 from board";
		int re = -1;
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				re = rs.getInt(1);
			}
			ConnectionProvider.close(rs, st, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	public int insertBoard(BoardVO b) {
		// 답글처리와 관련한 변수의 값을 설정
		int no = getNextNo();
		int pno = b.getNo();
		
		// 일단은 새글이라고 보고 b_ref는 글번호와 동일하게, b_level과 b_step은 0으로 설정
		int b_ref = no;
		int b_level = 0;
		int b_step = 0;
		
		// 만약에 답글달기인가요?
		if(pno != 0) {
			BoardVO p = detailBoard(pno);
			b_ref = p.getB_ref();
			b_level = p.getB_level();
			b_step = p.getB_step();
			
			// 최신의 답글을 먼저 출력하기 위하여 이미 달려있는 답글들의 b_step을 1씩 증가하기 위한 메소드 호출
			updateStep(b_ref, b_step);
			b_level++;
			b_step++;
		}
		int re = -1;
		try {
			String sql = "insert into board values(?,?,?,?,0,sysdate,?,?,?,?,?,?)";
			 Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, no);
	            ps.setString(2, b.getTitle());
	            ps.setString(3, b.getWriter());          
	            ps.setString(4, b.getPwd());
	            ps.setString(5, b.getContent());
	            ps.setString(6, b.getFname());
	            ps.setString(7, b.getIp());
	            ps.setInt(8, b_ref); 
	            ps.setInt(9, b_level); 
	            ps.setInt(10, b_step); 
	            re = ps.executeUpdate();
	            ConnectionProvider.close(null, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	private void updateStep(int b_ref, int b_step) {
		String sql = "update board set b_step = b_step + 1 where b_ref = ? and b_step > ?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, b_ref);
			ps.setInt(2, b_step);
			ps.executeQuery();
			ConnectionProvider.close(null, ps, conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}
