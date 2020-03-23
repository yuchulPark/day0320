package com.bit.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.print.attribute.standard.PresentationDirection;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {
	
	public static int totalRecord;// ��ü���ڵ���� �����ϱ� ���� ����
	
	public static int pageSIZE=10;// �� ȭ�鿡 ������ ���ڵ���� �����ϱ� ���� ����
	
	public static int totalPage;// ��ü ���������� �����ϱ� ���� ����
	
	public static int pageGROUP=5;// �� ȭ�鿡 ������ �������� ���� �����ϱ� ���� ����
	
		
	//��ü���ڵ���� ��ȯ�ϴ� �޼ҵ带 ����
	public int getTotalRecord() {
		int n = 0;
		try {
			String sql = "select count(*) from board";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				n =  rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return n;
	}
	
	
	
	//�Խù� ��ȣ�� �Ű������� ���޹޾� 
	//�ش� �Խù��� ��ȸ�� ������ ���� �޼ҵ带 ����
	public void updateHit(int no) {
		String sql = "update board set hit=hit+1 where no=?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	
	//�Խù� ������ ���� �޼ҵ�
	public int updateBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "update board set title=?, content=?, fname=? "
					+ "where no=? and pwd=?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getFname());
			pstmt.setInt(4, b.getNo());
			pstmt.setString(5, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}
	

	// �Խù���ȣ�� ��ȣ�� �Ű������� ���޹޾� �ش�Խù��� �����ϴ� �޼ҵ�
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		try {
			String sql = "delete board where no=? and pwd=?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, pwd);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	
	
	
	//���ϸ��� �Ű������� ���޹޾� �̹��� �������� �Ǻ��ϴ� �޼ҵ�
	public boolean isImage(String fname) {
		boolean re = false;
		
		if(fname != null) {
			fname  = fname.toLowerCase();
			String []arr = {".jpg",".gif",".png", ".bmp", ".jpeg"};
			for(int i=0; i<arr.length; i++) {
				if(fname.endsWith(arr[i])) {
					re = true;
					break;
				}
			}
		}
		return re;
	}
	
	
	
	//�Խù� ��ȣ�� �Ű������� ���޹޾� �ش�Խù��� ������ 
	//Vo�� ��� ��ȯ�ϴ� �޼ҵ�
	public BoardVo getBoard(int no) {
		
		BoardVo b = new BoardVo();
		try {
			String sql = "select * from board where no=?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setWriter(rs.getString(3));
				b.setPwd(rs.getString(4));
				b.setHit(rs.getInt(5));
				b.setRegdate(rs.getDate(6));
				b.setContent(rs.getString(7));
				b.setFname(rs.getString(8));
				b.setIp(rs.getString(9));
				b.setB_ref(rs.getInt(10));
				b.setB_level(rs.getInt(11));
				b.setB_step(rs.getInt(12));
			}
			
			ConnectionProvider.close(rs, pstmt, conn);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return b;
	}
	
	
	
	public ArrayList<BoardVo> listAll(int pageNUM){
		
		totalRecord = getTotalRecord();
		totalPage = totalRecord/ pageSIZE;
		if(totalRecord % pageSIZE != 0) {
			totalPage++;
		}
		System.out.println("��ü��������:"+totalPage);
		
		
		// ������������ ������ ���۷��ڵ��� ��ġ�� ����ؿ�.
		// ���� ��ü���ڵ尡 43���̰�
		// ������������ 1���������
		// ���۷��ڵ��� ��ġ�� 1
		// ���� ������������ 2��������� ���۷��ڵ��� ��ġ�� 11
		int start = (pageNUM-1) * pageSIZE + 1;
		int end = start+pageSIZE-1;
		if(end > totalRecord) {
			end = totalRecord;
		}
		
		
		String sql = "select no,title,writer,pwd,hit,regdate,content,fname,ip,b_ref,b_level,b_step from (" + 
				" select rownum n, no,title,writer,pwd,hit,regdate,content,fname,ip,b_ref,b_level,b_step from (" + 
				" select * from board order by b_ref desc, b_step))" + 
				" where n between ? and ?";
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			ResultSet rs = pstmt.executeQuery();
			//�۹�ȣ, ������, �ۼ���,��ȸ��, �����
			while(rs.next()) {
				BoardVo b = new BoardVo();
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setWriter(rs.getString(3));
				b.setHit(rs.getInt(5));
				b.setRegdate(rs.getDate(6));
				b.setIp(rs.getString(9));
				b.setB_ref(rs.getInt(10));
				b.setB_level(rs.getInt(11));
				b.setB_step(rs.getInt(12));
				list.add(b);
			}
			
			ConnectionProvider.close(rs, pstmt, conn);
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	
	//���ο� �۹�ȣ�� ��ȯ�ϴ� �޼ҵ带 ����
	public int getNextNo() {
		String sql = "select nvl(max(no),0)+1 from board";
		int re = 0;
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				re = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	
	
	public int insertBoard(BoardVo b) {
		
		//���ó���� ������ ������ ���� �����ؿ�.
		int no = getNextNo();
		
		//vo�� �Ǹ� �۹�ȣ(�θ���� �۹�ȣ)�� ���� �ɴϴ�.
		//���� 0�̶�� �����ۼ��̰�
		//���� 0�̾ƴ϶�� ����ۼ��Դϴ�.
		int p_no = b.getNo(); 
		
		//�ϴ��� �����̶�� ���� b_ref�� �۹�ȣ�� �����ϰ�, 
		//b_level�� b_step�� 0���� �����Ѵ�.
		int b_ref = no;
		int b_level = 0;
		int b_step = 0;
		
		//���࿡ ��۴ޱ� �ΰ���?
		if(p_no != 0) {
			
			//�θ���� ������ ���� �Ϳ�.
			BoardVo p= getBoard(p_no);
			
			//�θ���� b_ref�� �����ϰ� �ؿ�.
			b_ref = p.getB_ref();
			
			
			//�θ���� b_level�� b_step�� ���� �Ϳ�.
			b_level = p.getB_level();
			b_step = p.getB_step();
			
			//�ֽ��� ����� ���� ����ϱ� ���Ͽ�
			//�̹� �޷� �ִ� ��۵��� b_step�� 1�� �����ϱ� ���� �޼ҵ带 ȣ��
			updateStep(b_ref, b_step);
			
			//�θ���� b_level, b_step�� 1�� ������ŵ�ϴ�.
			b_level++;
			b_step++;
		}
		
		
		int re = -1;
		try {
			String sql = "insert into board values(?,?,?,?,0,sysdate,?,?,?,?,?,?)";
			Connection conn = ConnectionProvider.getConnection("c##bit1234","bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getWriter());			
			pstmt.setString(4, b.getPwd());
			pstmt.setString(5, b.getContent());
			pstmt.setString(6, b.getFname());
			pstmt.setString(7, b.getIp());
			pstmt.setInt(8, b_ref); 
			pstmt.setInt(9, b_level); 
			pstmt.setInt(10, b_step); 
			
			re = pstmt.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}



	private void updateStep(int b_ref, int b_step) {
		// TODO Auto-generated method stub
		
		// ���� ����� �ۼ��Ϸ��� �ϴ� �θ�ۿ� 
		// �̹� �޷� �ִ� ��۵��� b_step�� 1�� �������ѿ�.
		// ���� �ۼ��Ϸ��� �۰� b_ref�� ����
		// ���� �ۼ��Ϸ��� ���� b_step���� �� ū �͵�.
		String sql = "update board set b_step = b_step +1  where  b_ref=? and b_step > ?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b_ref);
			pstmt.setInt(2, b_step);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}



















