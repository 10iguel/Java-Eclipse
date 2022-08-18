package test;


public class Application {
	public static void main(String[] args) {
		
		Car car = new Car("My car");
		
		System.out.print(car.getName());
		
		double num[][] = {{1.2, 1.5, 1.8} ,{1.5, 2.3, 3.5}};
		
		System.out.print(num.length);
		System.out.print(num[0].length);
		
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
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
