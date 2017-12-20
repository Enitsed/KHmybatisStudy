package mysession;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ComSession {
	private SqlSession session;

	public ComSession() {

	} // 생성자

	public SqlSession connection() {
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
		return session;
	}// end connection

} // end class
