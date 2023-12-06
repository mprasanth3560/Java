package intro.org;

public  class Reverseword {
	
	public static void rev() {
		 String s = "Krishna";
		 String r = " ";
		 for (int i = s.length()-1; i >=0; i--) {
			r = r + s.charAt(i) ;		
		}
		 System.out.println("Reverse Word :" +r);
	}
	
	
	public static void reverse() {
		String s1 = "Digital Note Books";
		String[] split = s1.split(" ");
		String revstring = "";
		for (String x : split) {
			String revword = "";
			for (int i = x.length()-1; i >=0; i--) {
				revword = revword +x.charAt(i);
			}
			revstring = revstring + revword + " " ;
		}
		System.out.println("Origional String :" +s1);
		System.out.println("Reverse String : " +revstring);		
		
	}
	public static void main(String[] args) {
		rev();
		reverse();
	}
}
