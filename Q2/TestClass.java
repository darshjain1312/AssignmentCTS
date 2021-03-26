
public class TestClass{
	
	static Bird bird = new Bird();
	
	public static void main(String[] args){
		//Printing default values of static variables
		System.out.println("Bird - Static Variables ");
		System.out.println("Id :" + bird.id);
		System.out.println("Average Height : "+bird.averageHeight+" feet");
		System.out.println("Average Speed : "+bird.averageSpeed+" mph");
		System.out.println("Has wings : "+bird.hasWings);
		System.out.println("Name : "+bird.name);
		
		//Printing default values of instance variables
		System.out.println("\nBird : Instance Variables ");
		System.out.println("Id :" + bird.idI);
		System.out.println("Average Height : "+bird.averageHeightH+" feet");
		System.out.println("Average Speed : "+bird.averageSpeedS+" mph");
		System.out.println("Has wings : "+bird.hasWingsW);
		System.out.println("Name : "+bird.nameN);
		
		//Printing Object Reference of Bird
		
		System.out.println("\nTestClass : Object reference");
		System.out.println("Bird : "+bird);
	}
}