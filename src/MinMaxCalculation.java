//Maximum part is done by Riddhi Maniktalia

public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 20, 3 };

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        
        System.out.println("Maximum: " + max);
    }
}
