package exam;


import dao.MemberDao;
import dto.Member;

/**
 * insert()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class InsertMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Member member1 = new Member();
		member1.setId(4);
		member1.setName("シロー");
		member1.setAge(54);
		member1.setDepId(3);
		int count1 = dao.insert(member1);

		System.out.println("insert終了");
	}

}
