package part01;

import java.util.List;

import part01.dto.EmployeesDTO;

public class EmpTest {

	public static void main(String[] args) {
		EmployeesDAO dao = new EmployeesDAO();

		System.out.println("count: " + dao.countMethod());

		// List<EmployeesDTO> list = dao.allMethod();

		// List<EmployeesDTO> list = dao.searchMethod("lex");

		// List<EmployeesDTO> list = dao.yearMethod(1997);

		EmployeesDTO dt = new EmployeesDTO();
		dt.setFirst_name("lex");
		dt.setSalary(9000);
		List<EmployeesDTO> list = dao.dtoMethod(dt);

		for (EmployeesDTO dto : list) {
			System.out.printf("%s %d %s \n", dto.getFirst_name(), dto.getSalary(), dto.getHire_date());
		}

	} // end main()

} // end class
