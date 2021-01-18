package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {

	public static void main(String[] args) {
		//���� s -> s.getEnglishScore()�� applyAsInt()�� ��Ǿ��� ������ ���Ƕ�� �Ǵ��ϱ�� ����
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("���� ��� ����: " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("���� ��� ����: " + mathAvg);
	}

	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
	);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			//���ٽ� ���� ToIntFunction<Student> function = s -> s.getEnglishScore();
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
}
