package packageDay9;

public class EqualsExample {
	private String name;
	private int number;

	public EqualsExample(String name, int number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		EqualsExample that = (EqualsExample) obj;
		return number == that.number && name.equals(that.name);
	}

	public static void main(String[] args) {
		
		EqualsExample obj = new EqualsExample("nan", 23);
		EqualsExample obj1 = new EqualsExample("nam", 23);

		System.out.println(obj.equals(obj1)); // Prints false because names are different
		System.out.println(obj.hashCode());   // Prints the hashCode of obj
		System.out.println(obj1.hashCode());  // Prints the hashCode of obj1
	}
}
