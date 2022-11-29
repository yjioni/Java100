import java.util.*;
import static java.util.Collections.*;

class ColloectionsEx {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		System.out.println(list);
		
		addAll (list, 1, 2, 3, 4, 5); // 리스트에 내용 추가
		System.out.println(list);
		
		rotate(list, 2); // 오른쪽으로 2칸씩 이동
		System.out.println(list);
		
		swap(list, 0, 2); // 첫번째와 3번째 교환
		System.out.println(list);
		
		// swap(list, 1, -1);  // -1은 인식 불가
		swap(list, 0, 1);
		System.out.println(list);
		
		shuffle(list); // 랜덤
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		sort(list, reverseOrder());
		System.out.println(list);
		
		int idx = binarySearch(list, 3); // 3이 저장된 위치 반환
		System.out.println("index of 3: " + idx);
		
		System.out.println("max=" + max(list));
		System.out.println("max=" + min(list, reverseOrder()));
		System.out.println("min=" + min(list));
		System.out.println("min=" + max(list, reverseOrder()));
		
		fill(list, 9);
		System.out.println(list);
		
		List newList = nCopies(list.size(), 2);
		System.out.println("list="+list);
		System.out.println("newList=" + newList);
		
		System.out.println(disjoint(list, newList)); //공통 요소가 없으면 1, true
		
		copy(list, newList);
		System.out.println(list);
		System.out.println(newList);
		
		replaceAll(list, 2, 1);
		System.out.println(list);
		
		replaceAll(list, 1, 3);
		System.out.println(list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		System.out.println("list2=" + list2);
	}

}
