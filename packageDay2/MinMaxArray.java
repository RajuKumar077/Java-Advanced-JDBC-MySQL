package packageDay2;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 76, 30, 5};

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Largest Number: " + max);
        System.out.println("Smallest Number: " + min);
    }
}
