package part02;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mysession.ComSession;
import part02.dto.MemDTO;

public class MemDAO extends ComSession {
	private SqlSession session;

	public MemDAO() {
		session = connection();
	} // end 생성자

	public List<MemDTO> allMethod() {
		return session.selectList("mem.all");
	}

	public void insertMethod(MemDTO dto) {
		session.insert("mem.ins", dto);
	}

	public void updateMethod(HashMap<String, Object> map) {
		session.update("mem.upt", map);
	}

	public void deleteMethod(int num) {
		session.delete("mem.del", num);
	}

} // end class
