package chapter16;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample2 {
	public static void main(String[] args) {
		List<Student3> totalList = Arrays.asList(
			new Student3("홍길동", 10, Student3.Sex.MALE),
			new Student3("김수애", 6, Student3.Sex.FEMALE),
			new Student3("신용권", 10, Student3.Sex.MALE),
			new Student3("박수미", 6, Student3.Sex.FEMALE)
		);
		
		//병렬 처리
		//MaleStudent maleStudent = totalList.stream()
		MaleStudent maleStudent = totalList.parallelStream()
				.filter(s -> s.getSex() == Student3.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
} 
