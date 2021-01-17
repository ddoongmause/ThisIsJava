package chapter14;

public class MyFunctionalInterfaceExample3 {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;
		
		fi = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> {return x + y;};
		System.out.println(fi.method(2, 5));
		//return문만 있을 경우 중괄호{}와 return단어 생
		fi = (x,y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	public static int sum(int x, int y) {
		return (x + y);
	};
}
