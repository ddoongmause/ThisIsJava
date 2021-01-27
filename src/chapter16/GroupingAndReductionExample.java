package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student3> totalList = Arrays.asList(
			new Student3("홍길동", 10, Student3.Sex.MALE),
			new Student3("김수애", 12, Student3.Sex.FEMALE),
			new Student3("신용권", 10, Student3.Sex.MALE),
			new Student3("박수미", 12, Student3.Sex.FEMALE)
		);
		
		//성별로 평균 점수를 저장하는 Map 얻기
		Map<Student3.Sex, Double> mapBySex = totalList.stream()
				.collect(
					Collectors.groupingBy(
						Student3 :: getSex,
						Collectors.averagingDouble(Student3 :: getScore)
					)
				);
		
		System.out.println("남학생 평균 점수: " + mapBySex.get(Student3.Sex.MALE));
		System.out.println("여학생 평균 점수: " + mapBySex.get(Student3.Sex.FEMALE));
		
		//성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
		Map<Student3.Sex, String> mapByName = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student3 :: getSex,
								Collectors.mapping(Student3 :: getName, Collectors.joining(","))
						)
				);
		System.out.println("남학생 전체 이름: " + mapByName.get(Student3.Sex.MALE));
		System.out.println("여학생 전체 이름: " + mapByName.get(Student3.Sex.FEMALE));
	}

}
