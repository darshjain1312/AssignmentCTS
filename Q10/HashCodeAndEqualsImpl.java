
public class HashCodeAndEqualsImpl {
	public static void main(String[] args) {
		Bird b = new Bird();
		Bird b1 = new Bird();
		System.out.println("Equals Method : "+b.equals(b1));
		System.out.println("Hash Code for first object : "+b.hashCode());
		System.out.println("Hash Code for se: "+b1.hashCode());
		
	}
}
