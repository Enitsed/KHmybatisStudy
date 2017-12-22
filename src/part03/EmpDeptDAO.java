package part03;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mysession.ComSession;
import part03.dto.DeptDTO;
import part03.dto.EmpDTO;

public class EmpDeptDAO extends ComSession {
	private SqlSession session;

	public EmpDeptDAO() {
		session = connection();
	} // end constructor

	public List<EmpDTO> emp_deptMethod() {
		return session.selectList("join.emp_dept");
	}

	public List<DeptDTO> dept_empMethod() {
		return session.selectList("join.dept_emp");
	}

	public List<EmpDTO> partMethod() {
		return session.selectList("join.dnator");
	}
} // end class
