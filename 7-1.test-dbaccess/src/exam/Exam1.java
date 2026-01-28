package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author maemurasuzu
 */
public class Exam1 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "Maesuzu7533";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
        int count = 0;
		String sql1 = null;
        String sql2 = null;
        String sql3 = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql1 = "INSERT INTO test_members (id, name,age, dep_id) VALUES(1, '山田太郎', 62, 1);";
            sql2 = "INSERT INTO test_members (id, name,age, dep_id) VALUES(2, '佐藤花子', 33, 2);";
            sql3 = "INSERT INTO test_members (id, name,age, dep_id) VALUES(3, '遠藤次郎', 55, 2);";

			// (3)SQL実行準備
            // (4)SQL実行
			pstmt = con.prepareStatement(sql1);
            count = pstmt.executeUpdate();
            pstmt = con.prepareStatement(sql2);
            count = pstmt.executeUpdate();
            pstmt = con.prepareStatement(sql3);
            count = pstmt.executeUpdate();

			// (5)結果の操作
			// ※ここに結果の操作処理を書く
            System.out.println(count + "件実施");
		} catch (SQLException ex) {
			System.err.println("SQL = " + sql1);
            System.err.println("SQL = " + sql2);
            System.err.println("SQL = " + sql3);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
                if(con != null){
                    con.close();
                }
				if(pstmt != null){
                    pstmt.close();
                }
			} catch (SQLException ex) {
                ex.printStackTrace();
            }
		}
    }
}
