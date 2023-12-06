package intro.org;

public class Varible {
	//Local
	public void age() {
		int age = 0;
		age = age + 25 ;
		System.out.println("My Age :" +age);
	}
	
	public static void main(String[] args) {
		Varible v = new Varible();
		v.age();
	}
}
