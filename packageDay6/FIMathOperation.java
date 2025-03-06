package packageDay6;

@FunctionalInterface
interface FIMathOperation {

	// Abstract method (must be implemented by the class implementing the interface)
	abstract int operate(int a, int b);

	// Default method (can be used by classes that implement the interface)
	default int add(int a, int b) {
		return a + b;
	}
}