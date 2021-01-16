package chapter13;

import java.util.Arrays;

public class Course<T> {
	
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		System.out.println(Arrays.toString(students)+"끄억"+capacity);
	}
	
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	//배열에 비어있는 부분을 찾아서 수강생을 추가
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			students[i] = t;
			break;
 		}
	}
}
