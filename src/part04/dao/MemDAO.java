package part04.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mysession.ComSession;
import part04.dto.MemDTO;

public class MemDAO extends ComSession {
	private SqlSession session;

	public MemDAO() {
		session = connection();
	}

	public List<MemDTO> allMethod() {
		return session.selectList("per.all");
	}

	public void deleteMethod(String[] valList) {
		session.delete("per.del", valList);
	}
	
} // end class
