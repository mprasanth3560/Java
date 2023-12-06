package intro.org;

public class Dbinding extends Sbinding {
	
	@Override
	public void regNo(int no) {
		super.regNo(no);
	}
	public void name() {
		 System.out.println("Name : Krishna prasanth" );

	}
	
	public static void main(String[] args) {
		Dbinding db = new Dbinding();
		db.regNo(10);
		db.name();
	}
}
