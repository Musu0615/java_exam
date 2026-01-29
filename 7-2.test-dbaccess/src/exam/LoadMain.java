package exam;

import dao.MemberDao;
import dto.Member;

/**
 * load()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class LoadMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Member members = dao.load(2);
		
		System.out.println("id=" + members.getId());
		System.out.println("name=" + members.getName());
		System.out.println("age=" + members.getAge());
		System.out.println("dep_id=" + members.getDepId());
	}

}
