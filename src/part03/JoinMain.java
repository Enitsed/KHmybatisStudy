package part03;

import java.util.List;

import part03.dto.DeptDTO;
import part03.dto.EmpDTO;

public class JoinMain {

	public static void main(String[] args) {
		EmpDeptDAO dao = new EmpDeptDAO();
		// List<EmpDTO> aList = dao.emp_deptMethod();
		// for (EmpDTO dto : aList) {
		// System.out.printf("%s %s %s %s %s \n", dto.getEmployee_id(),
		// dto.getFirst_name(), dto.getJob_id(),
		// dto.getDepartment_id(), dto.getDept().getDepartment_name());
		// }

		// List<DeptDTO> aList = dao.dept_empMethod();
		// for (DeptDTO dto : aList) {
		// for (EmpDTO em : dto.getEmpList()) {
		// System.out.printf("%s %s %s %s \n", dto.getDepartment_id(),
		// dto.getDepartment_name(),
		// em.getEmployee_id(), em.getFirst_name());
		// }
		// }

		List<EmpDTO> aList = dao.partMethod();
		for (EmpDTO dto : aList) {
			System.out.printf("%s %s %s %s \n", dto.getEmployee_id(), dto.getFirst_name(), dto.getJob_id(),
					dto.getDepartment_id());
		}

	} // end main()

} // end class
