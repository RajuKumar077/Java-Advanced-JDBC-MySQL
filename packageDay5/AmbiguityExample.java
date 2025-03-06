package packageDay5;

import java.util.Date; // Import the Date class

public class AmbiguityExample {
    public static void main(String[] args) {
        Date date = new Date();  // Use the Date class from java.util
        System.out.println(date);
    }
}



/*
 * public class AmbiguityExample { public static void main(String[] args) {
 * java.util.Date utilDate = new java.util.Date(); // Using fully qualified name
 * java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis()); //
 * Using fully qualified name
 * 
 * System.out.println("utilDate: " + utilDate); System.out.println("sqlDate: " +
 * sqlDate); } }
 */



/*
 * import java.util.Date; import java.sql.Date;
 * 
 * public class AmbiguityExample { public static void main(String[] args) { Date
 * date = new Date(); // Which Date should the compiler use?
 * System.out.println(date); } }
 */

/*
 * import java.util.Date; // Only import the Date class from java.util
 * 
 * public class AmbiguityExample { public static void main(String[] args) { Date
 * date = new Date(); // No ambiguity, only java.util.Date is imported
 * System.out.println(date); } }
 */
