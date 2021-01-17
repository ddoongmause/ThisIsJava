package chapter14;

public class MyFuncationalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		//실행문이 하나라면 중괄호{}는 생략
		fi = () -> System.out.println("method call3");
		fi.method();
	}

}
