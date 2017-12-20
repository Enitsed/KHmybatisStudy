package part01;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part01.dto.EmployeesDTO;

public class EmployeesDAO {

	private SqlSession session;

	public EmployeesDAO() {
		// 1. 트랜잭션이 설정되어 있는 파일의 경로를 정의한다.
		String resource = "config/configuration.xml";

		try {
			// 2. 설정파일을 로딩하기 위해서 입력스트림과 연결한다.
			Reader reader = Resources.getResourceAsReader(resource);

			// 3. 설정파일을 저장하기 위한 팩토리를 생성해줄 수 있는 빌더를 생성한다.
			SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();

			// 4. 설정파일의 정보를 읽어와 관리해주는 팩토리를 생성한다.
			SqlSessionFactory factory = sqlBuilder.build(reader);

			// 5. 쿼리문에 접근할 수 있도록 sqlSession 객체를 리턴한다.
			// openSession() 의 기본 값은 false이다.
			// 자동 커밋을 설정하고 싶으면 openSession(true)로 설정한다.
			session = factory.openSession(true);

			// 6. 입력스트림 연결을 종료한다.
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	} // 생성자

	public List<EmployeesDTO> allMethod() {
		return session.selectList("emp.all"); // namespace.id
	} // end allMethod()

	public int countMethod() {
		return session.selectOne("emp.one");
	} // end countMethod()

	public List<EmployeesDTO> searchMethod(String name) {
		return session.selectList("emp.search", name);
	} // end searchMethod()

	public List<EmployeesDTO> yearMethod(int year) {
		return session.selectList("emp.yearList", year);
	} // end yearMethod()

	public List<EmployeesDTO> dtoMethod(EmployeesDTO dto) {
		return session.selectList("emp.dtoList", dto);
	} // end dtoMethod()

	public List<EmployeesDTO> mapMethod(HashMap<String, Object> map) {
		return session.selectList("emp.mapList", map);
	} // end dtoMethod()

	public List<EmployeesDTO> moneyMethod(HashMap<String, Integer> hp) {
		return session.selectList("emp.moneyList", hp);
	}

} // end class
