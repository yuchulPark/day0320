package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.vo.BoardVO;
import com.bit.vo.ConnectionProvider;

public class BoardDAO {
	public static int totalRecord; // ��ü���ڵ� ���� �����ϱ� ���� ����
	public static int pageSIZE = 3; // �� ȭ�鿡 ������ ���ڵ���� �����ϱ� ���� ����
	public static int totalPage; // ��ü ������ ���� �����ϱ� ���� ����
	public static int pageGROUP = 3; // �� ȭ�鿡 ������ ������ ���� �����ϱ� ���� ���� 
	
	public int getTotalRecord() { // ��ü ���ڵ� ���� ��ȯ�ϱ� ���� �޼ҵ�
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
	// �Խù� ��ȣ�� �Ű������� ���޹޾� �ش� �Խù��� ��ȸ���� ������Ű�� ���� �޼ҵ� ����
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
	// ���ϸ��� �Ű������� ���޹޾� �̹��� �������� �Ǻ��ϴ� �޼ҵ�
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
		System.out.println("��ü ������ �� : " + totalPage);
		// ���� �������� ������ ���۷��ڵ��� ��ġ�� ���. ���� ��ü���ڵ尡 43���̰�, ���� �������� 1��������� ���۷��ڵ��� ��ġ�� 1, ���� ������������ 2��������� ���۷��ڵ��� ��ġ�� 11
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
	// ���ο� �۹�ȣ�� ��ȯ�ϴ� �޼ҵ�
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
		// ���ó���� ������ ������ ���� ����
		int no = getNextNo();
		int pno = b.getNo();
		
		// �ϴ��� �����̶�� ���� b_ref�� �۹�ȣ�� �����ϰ�, b_level�� b_step�� 0���� ����
		int b_ref = no;
		int b_level = 0;
		int b_step = 0;
		
		// ���࿡ ��۴ޱ��ΰ���?
		if(pno != 0) {
			BoardVO p = detailBoard(pno);
			b_ref = p.getB_ref();
			b_level = p.getB_level();
			b_step = p.getB_step();
			
			// �ֽ��� ����� ���� ����ϱ� ���Ͽ� �̹� �޷��ִ� ��۵��� b_step�� 1�� �����ϱ� ���� �޼ҵ� ȣ��
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
