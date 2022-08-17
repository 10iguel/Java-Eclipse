package test;


public class Application {
	public static void main(String[] args) {
		
		Car car = new Car("My car");
		
		double num[][] = {{1.2, 1.5, 1.8} ,{1.5, 2.3, 3.5}};
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j]);
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

}

class Car{

	private String name;
	
	
	public Car(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void start() {
		System.out.println("You did it");
	}
	
	
}
