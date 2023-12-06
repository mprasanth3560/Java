package intro.org;

public class ReverseStr {
	
	public static void main(String[] args) {
		String s = "Laptop";
		String re = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			re = re+s.charAt(i);
		}
		System.out.println("Reverse String :" +re);
	}	

}
