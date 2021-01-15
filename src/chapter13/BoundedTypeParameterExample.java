package chapter13;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util3.compare("a", "b");Number 타입이 아님
		//int -> Integer
		int result1 = Util3.compare(10, 20);
		System.out.println("result1 : " + result1);
		//double -> Double
		int result2 = Util3.compare(4.5, 3);
		System.out.println("result2 : " + result2);
	}
}
