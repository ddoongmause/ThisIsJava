package chapter15;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	//name과 age 값이 같으면 true를 리턴
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			//name은 기존의 해쉬코드 값임 
			System.out.println("member.name : " + member.name);
			System.out.println("name : " + name);
			return member.name.equals(name) && (member.age == age);
		}else {
			System.out.println("name : " + name);
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		//String의 hashCode() 이용
		return name.hashCode() + age;
	}
}
