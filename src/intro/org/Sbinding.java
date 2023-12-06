package intro.org;

public class Sbinding {
	
	public void regNo(int no) {
		System.out.println("Reg No :" +no); 

	}
	
	public void regNo(String no) {
		 System.out.println("Reg No :" +no);

	}
	
	public static void main(String[] args) {
		Sbinding sb = new Sbinding();
		sb.regNo(17);
		sb.regNo("15");
	}
}
