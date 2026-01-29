package exam;


import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		Member members = new Member();
		members.setAge(100);
		int count = dao.update(members);
		
		dao.load(2);
		System.out.println("id:" + members.getId());
		System.out.println("name:" + members.getName());
		System.out.println("age:" + members.getAge());
		System.out.println("dep_id:" + members.getDepId());
		
		System.out.println("update終了");
	}
}
