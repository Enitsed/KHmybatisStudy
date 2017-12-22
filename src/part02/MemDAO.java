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

	public int keyMethod() {
		return session.selectOne("mem.keyNum");
	}

	public void multiInsertMethod(List<MemDTO> list) {
		session.insert("mem.multiIns", list);
	}

	public int multiDeleteMethod(List<Integer> aList) {
		return session.delete("mem.multiDel", aList);
	}

	public int multiDeleteMethod(Integer[] array) {
		return session.delete("mem.multiDel2", array);
	}

	public List<MemDTO> searchMethod(MemDTO mt) {
		return session.selectList("mem.search", mt);
	}

	public void multiUptMethod(MemDTO dto) {
		session.update("mem.multiUpt", dto);
	}

	public void locInseMethod(MemDTO dto) {
		session.insert("mem.insData", dto);
	}

} // end class
