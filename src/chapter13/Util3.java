package chapter13;

public class Util3 {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();	//Number의 doubleValue() 메소드 사
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
