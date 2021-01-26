package chapter16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		List<Student3> totalList = Arrays.asList(
			new Student3("홍길동", 10, Student3.Sex.MALE),
			new Student3("김수애", 6, Student3.Sex.FEMALE),
			new Student3("신용권", 10, Student3.Sex.MALE),
			new Student3("박수미", 6, Student3.Sex.FEMALE)
		);
		
		//남학생들만 묶어 List 생성
		List<Student3> maleList = totalList.stream()
									.filter(s -> s.getSex() == Student3.Sex.MALE)
									.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//여학생들만 묶어 HashSet 생성
		Set<Student3> femaleSet = totalList.stream()
									.filter(s -> s.getSex() == Student3.Sex.FEMALE)
									.collect(Collectors.toCollection(HashSet :: new ));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
