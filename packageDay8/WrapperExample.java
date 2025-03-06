package packageDay8;

public class WrapperExample {
    public static void main(String[] args) {
    	
        // Primitive data types
        int num = 10;
        double decimal = 20.5;
        char character = 'A';
        boolean flag = true;

        // Using Wrapper classes to convert primitives to objects (Boxing)
        Integer wrappedInt = Integer.valueOf(num);
        Double wrappedDouble = Double.valueOf(decimal);
        Character wrappedChar = Character.valueOf(character);
        Boolean wrappedBoolean = Boolean.valueOf(flag);

        // Unboxing: Converting objects back to primitives
        int unboxedInt = wrappedInt.intValue();
        double unboxedDouble = wrappedDouble.doubleValue();
        char unboxedChar = wrappedChar.charValue();
        boolean unboxedBoolean = wrappedBoolean.booleanValue();

        // Auto-boxing and Auto-unboxing
        Integer autoBoxedInt = num; // Auto-boxing
        int autoUnboxedInt = autoBoxedInt; // Auto-unboxing

        // Display results
        System.out.println("Original Integer: " + num + ", Wrapped Integer: " + wrappedInt);
        System.out.println("Original Double: " + decimal + ", Wrapped Double: " + wrappedDouble);
        System.out.println("Original Character: " + character + ", Wrapped Character: " + wrappedChar);
        System.out.println("Original Boolean: " + flag + ", Wrapped Boolean: " + wrappedBoolean);
        System.out.println("Auto-unboxed Integer: " + autoUnboxedInt);
    }
}
