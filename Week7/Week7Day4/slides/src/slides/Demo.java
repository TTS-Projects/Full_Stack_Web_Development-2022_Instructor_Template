package slides;


public class Demo {
	int x = 5;

	public static void main(String[] args) {
//		Motorcycle motorcycle = new Motorcycle(); 
//		motorcycle.changeGear(5); 
//		motorcycle.accelerate(15); 
//		motorcycle.brake(1); 
// 
//		System.out.println("Motorcycle display status :"); 
//		motorcycle.displayStatus(); 
// 
//		// creating instance of RallyCar
//		RallyCar rallyCar = new RallyCar(); 
//		rallyCar.changeGear(3); 
//		rallyCar.accelerate(12); 
//		rallyCar.brake(2); 
// 
//		System.out.println("RallyCar display status :"); 
//		rallyCar.displayStatus(); 
		
		
//		Instrument guitar = new Guitar();
//		guitar.createSound();
		
		//aggregation example
		Address address = new Address(630, "Hendersonville", "NC");
		Programmer object = new Programmer("Sarah", address);
		System.out.println(object.name);
		System.out.println(object.programmerAddr.streetNum);
		System.out.println(object.programmerAddr.city);
		System.out.println(object.programmerAddr.state);
	}
}