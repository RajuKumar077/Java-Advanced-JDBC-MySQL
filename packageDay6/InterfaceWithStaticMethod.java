package packageDay6;


interface NewInterface {

	// static method
	static void hello()
	{
		System.out.println("Hello, New Static Method Here");
	}

	// Works like abstract Method
	void hello(String str); 

	// Public and abstract method of Interface
	void overrideMethod(String str);
}

public class InterfaceWithStaticMethod implements NewInterface {

	// Implementing interface method

	@Override
	public void overrideMethod(String str)
	{
		System.out.println(str);
	}
	@Override
	public void hello(String str)
	{
		System.out.println(str);
	}


	public static void main(String[] args)
	{
		InterfaceWithStaticMethod interfaceDemo = new InterfaceWithStaticMethod();

		// Calling the static method of interface
		NewInterface.hello();

		// Calling the abstract method of interface
		interfaceDemo.overrideMethod("Hello, Override Method here");

		interfaceDemo.hello("This Hello is due to abstarct method defination");
	}


}

