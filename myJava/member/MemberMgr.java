package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberMgr {

	private DBConnectionMgr pool;

	public MemberMgr() {
		pool = DBConnectionMgr.getInstance();

	}

	// ����
	public boolean insertMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;

		try {
			con = pool.getConnection();
			sql = "insert tblmember values (null, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			int cnt = pstmt.executeUpdate();
			if (cnt == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt); // con�� �ݳ�, pstmt�� close
		}
		return flag;
	}

	// ����Ʈ
	public Vector<MemberBean> listMember() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<MemberBean> vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblmember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setNum(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setPhone(rs.getString(3));
				bean.setAddress(rs.getString(4));
				bean.setTeam(rs.getString(5));

				vlist.addElement(bean); // ���� ���ϴ� ��� ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs); // con�� �ݳ�, pstmt/rs�� close
		}
		return vlist;
	}

	// ���ڵ� �Ѱ�
	public MemberBean getMember(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "select * from tblmember where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) { // �ϳ��� ���ڵ常 ����
				bean.setNum(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setPhone(rs.getString(3));
				bean.setAddress(rs.getString(4));
				bean.setTeam(rs.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs); // con�� �ݳ�, pstmt/rs�� close
		}
		return bean;
	}

	// ����
	public boolean updateMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;

		try {
			con = pool.getConnection();
			sql = "update tblmember set name = ?, phone = ?, address = ?, team = ? where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			pstmt.setInt(5, bean.getNum());
			if (pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt); // con�� �ݳ�, pstmt�� close
		}
		return flag;
	}

	// ����
	public boolean deleteMember(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;

		try {
			con = pool.getConnection();
			sql = "delete from tblmember where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);

			if (pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt); // con�� �ݳ�, pstmt�� close
		}
		return flag;
	}
	
	public Vector<String> getTeamList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<String> vlist = new Vector<String>();
		try {
			con = pool.getConnection();
			sql = "select distinct team from tblmember";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				vlist.addElement(rs.getString(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	// �����ȣ �˻�
	public Vector<ZipcodeBean> searchZipcode(String area3) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblzipcode where area3 like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + area3 + "%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				bean.setZipcode(rs.getString("zipcode"));
				bean.setArea1(rs.getString("area1"));
				bean.setArea2(rs.getString("area2"));
				bean.setArea3(rs.getString("area3"));

				vlist.addElement(bean); // ���� ���ϴ� ��� ���

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs); // con�� �ݳ�, pstmt/rs�� close
		}
		return vlist;
	}

	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		MemberBean bean = new MemberBean();
		
		// mgr.searchZipcode("�����");
		// mgr.listMember();

		/*
		 * bean.setName("������"); bean.setPhone("010-5555-2323");
		 * bean.setAddress("�λ�� ������"); bean.setTeam("���Ǵ�"); boolean result =
		 * mgr.insertMember(bean); System.out.println(result);
		 */
	}

}
