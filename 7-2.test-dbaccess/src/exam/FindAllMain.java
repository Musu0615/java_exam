package exam;

import java.util.List;

import dao.MemberDao;
import dto.Member;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		List<Member> members = dao.findAll();

		for(Member list:members){
			System.out.println("id=" + list.getId());
			System.out.println("name=" + list.getName());
			System.out.println("age=" + list.getAge());
			System.out.println("dep_id=" + list.getDepId());

		}


	

	}

}
