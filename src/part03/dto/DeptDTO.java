package part03.dto;

import java.util.List;

public class DeptDTO {
	private String department_id, department_name;
	private List<EmpDTO> empList;

	public DeptDTO() {

	}

	public DeptDTO(String department_id, String department_name) {
		this.department_id = department_id;
		this.department_name = department_name;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public List<EmpDTO> getEmpList() {
		return empList;
	}

	public void setEmpList(List<EmpDTO> empList) {
		this.empList = empList;
	}

} // end class
