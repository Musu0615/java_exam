package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	private static final String TABLE_NAME = "test_members";
	public List<Member> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "SELECT * FROM " + TABLE_NAME + " ORDER BY age ASC;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに全件検索処理を書く
			ResultSet rs = pstmt.executeQuery();
			List<Member> lists = new ArrayList<>();
			while(rs.next()){
				Member members = new Member();
				members.setId(rs.getInt("id"));
				members.setName(rs.getString("name"));
				members.setAge(rs.getInt("age"));
				members.setDepId(rs.getInt("dep_id"));
				lists.add(members);
				
			}
			return lists;
			//return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member load(int id){
		Connection con = DBManager.createConnection();
		String sql = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			Member members = new Member();
			if(rs.next()){
				members.setId(rs.getInt("id"));
				members.setName(rs.getString("name"));
				members.setAge(rs.getInt("age"));
				members.setDepId(rs.getInt("dep_id"));

			}
			return members; 
			//return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public int insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO " + TABLE_NAME + " (name, age, dep_id) VALUES(?, ?, ?);";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く
			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getAge());
			pstmt.setInt(3, member.getDepId());
			int count = pstmt.executeUpdate();
			return count;
		} 
		catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	public int update(Member member){
		Connection con = DBManager.createConnection();
		String sql = "UPDATE " + TABLE_NAME + " SET age = ? WHERE id = ?;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く
			pstmt.setInt(1, member.getAge());
			pstmt.setInt(2, member.getId());
			int count = pstmt.executeUpdate();
			return count;
		} 
		catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

}
