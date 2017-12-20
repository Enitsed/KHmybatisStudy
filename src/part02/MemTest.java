package part02;

import java.util.HashMap;
import java.util.List;

import part02.dto.MemDTO;

public class MemTest {

	public static void main(String[] args) {
		MemDAO dao = new MemDAO();
		// dao.insertMethod(new MemDTO("박사랑", 30, "평야"));
		// dao.insertMethod(new MemDTO("유대리", 20));

		// num컬럼의 값이 33일때 loc컬럼의 값을 '제주'로 수정
		/*
		 * HashMap<String, Object> map = new HashMap<>(); map.put("loc", "제주");
		 * map.put("num", 33); dao.updateMethod(map);
		 */

		// num컬럼의 값이 33일때 레코드 삭제
		dao.deleteMethod(33);

		List<MemDTO> list = dao.allMethod();
		for (MemDTO dto : list) {
			System.out.printf("%d %s %d %s \n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		}

	} // end main()

} // end class
