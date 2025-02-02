package ch11;

// == : 주소값 비교

class Member{
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}

public class ObjectEx3 {

	public static void main(String[] args) {
		Member obj1 = new Member("aaa");
		Member obj2 = new Member("aaa");
		Member obj3 = new Member("a");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
	}
}
