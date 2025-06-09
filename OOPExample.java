class Animal
{
private String name ; 				// Encapsulation

public Animal(String name)
{
this.name=name;
}

public String getName()				// Getter method
{
return name;
}
public void sound() 
{
	System.out.println("Animal makes a sound ");
  }
}


class Dog extends Animal
  {
	public Dog(String name)
  {
	super(name);				 // call parent constructor
  }

  @Override 					// Method Overriding (Pollymorphism)

  public void sound()
  {
  System.out.println(getName()+"says: woof woof ");
   }
 }

public class OOPExample 
  {
public static void main(String args [])
  {
						   // creating objects
	Animal A1 = new Animal("generic Animal");
	Dog  D1 = new Dog("Buddy");

	A1.sound();
	D1.sound();
  }
  }