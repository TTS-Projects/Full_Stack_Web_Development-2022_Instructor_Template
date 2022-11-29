package slides_oop1;
//class definition
public class Car
{
 private String Color;
 private int NumberOfDoors;
 
 public Car() {
	 //Color = "white";
	 //NumberOfDoors = 14;
 }


 // constructor with arguments
 public Car(String color, int doors)
 {
     this.Color = color;
     this.NumberOfDoors = doors;
 }




/**
 * @return the color
 */
public String getColor() {
	return Color;
}


@Override
public String toString() {
	return "Car [Color=" + Color + ", NumberOfDoors=" + NumberOfDoors + "]";
}


/**
 * @param color the color to set
 */
public void setColor(String color) {
	Color = color;
}


/**
 * @return the numberOfDoors
 */
public int getNumberOfDoors() {
	return NumberOfDoors;
}


/**
 * @param numberOfDoors the numberOfDoors to set
 */
public void setNumberOfDoors(int numberOfDoors) {
	 if ( numberOfDoors >= 1 && numberOfDoors <= 6)
         this.NumberOfDoors = numberOfDoors;
     else
         this.NumberOfDoors = -1;
}


// constructor with a single argument
 public Car(String color)
 {
     this.Color = color;
     this.NumberOfDoors = 4;
 }

 public void start()
 {
     System.out.println("Car starting");
     return;
 }

 public void stop()
 {
     System.out.println("Car stopping");
 }

//Just start driving
public void drive()
{
  System.out.println("Car driving");
}

//Drive for the specified number of miles
public void drive(int miles)
{
  System.out.println("Driving for " + miles + " miles.");
}

//Drive specified miles at the specified speed
public void drive(int miles, String speed)
{
  System.out.println("Driving " + speed + "mph for " + miles + " miles.");
}


//drive to the specified destination
public void drive(String destination)
{
  System.out.println("Driving to " + destination);
}
}

