package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Student3> totalList = Arrays.asList(
			new Student3("홍길동", 10, Student3.Sex.MALE, Student3.City.Seoul),
			new Student3("김수애", 6, Student3.Sex.FEMALE, Student3.City.Pusan),
			new Student3("신용권", 10, Student3.Sex.MALE, Student3.City.Pusan),
			new Student3("박수미", 6, Student3.Sex.FEMALE, Student3.City.Seoul)
		);
		
		Map<Student3.Sex, List<Student3>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student3 :: getSex));
		
		System.out.println("[남학생] ");
		mapBySex.get(Student3.Sex.MALE).stream()
			.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println("\n [여학생]");
		mapBySex.get(Student3.Sex.FEMALE).stream()
			.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println();
		
		Map<Student3.City, List<String>> mapByCity = totalList.stream()
				.collect(
					Collectors.groupingBy(
							Student3 :: getCity, Collectors.mapping(Student3 :: getName, Collectors.toList())
					)
				);
		
		System.out.print("\n[서울]");
		mapByCity.get(Student3.City.Seoul).stream().forEach(s -> System.out.print(s + " "));
				
	}
}
