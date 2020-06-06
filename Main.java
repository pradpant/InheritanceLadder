class Vehicle
{ 
  public Vehicle()
  { 
    System.out.println("Default "); 
      System.out.println("Auto Call Vehicle Class");

  } 
} 
class Car extends Vehicle
{ 
public Car(String carName)
  { 
  System.out.println(carName + "");
  System.out.println("Now Call at Car Class");

  } 
} 
class Bus extends Car
{ 
public Bus(String busName)
{  
  super(busName);
  System.out.println(busName + "");
  System.out.println("Now Call at bus Class");

} 
} 
public class Main
{
  public static void main(String[] args) 
  { 
    Vehicle v=new Vehicle();
    Car car=new Car("Ford");
    Bus bus=new Bus("Volvo");
  }
}