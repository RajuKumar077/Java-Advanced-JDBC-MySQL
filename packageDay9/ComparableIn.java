package packageDay9;

import java.util.*;


class ComparableIn implements Comparable<ComparableIn> {
    int id;
    int age;

    // Constructor
    ComparableIn(int id, int age) {
        this.id = id;
        this.age = age;
    }

    // Overriding the compareTo method for sorting based on age
    @Override
    public int compareTo(ComparableIn o) {
        // Compare based on the age field
        if (this.age > o.age) {
            return 1;   // Current object is older, return 1
        } else if (this.age < o.age) {
            return -1;  // Current object is younger, return -1
        } else {
            return 0;   // Same age, return 0
        }
    }

    // To display the object values
    public String toString() {
        return "ID: " + id + ", Age: " + age;
    }

    public static void main(String[] args) {
        List<ComparableIn> obList = new ArrayList<>();

        // Adding some sample objects
        obList.add(new ComparableIn(1, 25));
        obList.add(new ComparableIn(2, 30));
        obList.add(new ComparableIn(3, 22));

        // Sorting the list based on the compareTo method
        Collections.sort(obList);

        // Printing the sorted values
        System.out.println("Print the values of objects:");
        for (ComparableIn c : obList) {
            System.out.println(c); // Will call toString() implicitly
        }
    }
}
