package chapter14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		//생성자 참조
		Function<String, Member2> function1 = Member2 :: new;
		//매개값 1개
		Member2 member1 = function1.apply("angel");
		
		BiFunction<String, String, Member2> function2 = Member2 :: new;
		//매개값 2개
		Member2 member2 = function2.apply("신천사", "angel");
	}

}
