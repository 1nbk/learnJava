public class First100OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 100) {
            System.out.println(number);
            number += 2; // Move to the next odd number
            count++;
        }
    }
}
