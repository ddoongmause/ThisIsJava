package chapter16;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student3> totalList = Arrays.asList(
			new Student3("홍길동", 10, Student3.Sex.MALE),
			new Student3("김수애", 6, Student3.Sex.FEMALE),
			new Student3("신용권", 10, Student3.Sex.MALE),
			new Student3("박수미", 6, Student3.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student3.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
