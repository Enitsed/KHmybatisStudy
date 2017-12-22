package part02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import part02.dto.MemDTO;

public class MemTest {

	public static void main(String[] args) {
		MemDAO dao = new MemDAO();
		// dao.insertMethod(new MemDTO("박사랑", 30, "평야"));
		// dao.insertMethod(new MemDTO("유대리", 20));

		// num컬럼의 값이 33일때 loc컬럼의 값을 '제주'로 수정

		// HashMap<String, Object> map = new HashMap<>();
		// map.put("loc", "제주");
		// map.put("num", 33);
		// dao.updateMethod(map);

		// num컬럼의 값이 33일때 레코드 삭제
		// dao.deleteMethod(33);

		// 다중 insert
		// List<MemDTO> alist = new ArrayList<MemDTO>();
		// alist.add(new MemDTO(dao.keyMethod(), "java", 20, "toronto"));
		// alist.add(new MemDTO(dao.keyMethod(), "jsp", 15, "summary"));
		// dao.multiInsertMethod(alist);

		// 다중 delete with List
		// List<Integer> aList = new ArrayList<>();
		// aList.add(24);
		// aList.add(25);
		// System.out.println("total 삭제: " + dao.multiDeleteMethod(aList));

		// 다중 delete with Array
		// Integer[] array = new Integer[2];
		// array[0] = 34;
		// array[1] = 35;
		// System.out.println("total 삭제:" + dao.multiDeleteMethod(array));

		// 동적 sql 검색 구문
		// MemDTO mt = new MemDTO();
		// mt.setAge(20);
		// List<MemDTO> list = dao.searchMethod(mt);

		// MemDTO mt = new MemDTO();
		// mt.setAge(70);
		// mt.setNum(30);
		// dao.multiUptMethod(mt);

		// MemDTO mm = new MemDTO("방섬이", 40, "경주");
		MemDTO mm = new MemDTO("돌돌이", 60);
		dao.locInseMethod(mm);

		List<MemDTO> list = dao.allMethod();
		for (MemDTO dto : list) {
			System.out.printf("%d %s %d %s \n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		}

	} // end main()

} // end class
