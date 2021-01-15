package chapter13;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
		String name = box1.get();
		System.out.println(name);
		Box<Integer> box2 = new Box<Integer>();
		box2.set(555);
		int number = box2.get();
		System.out.println(number);
	}
}
