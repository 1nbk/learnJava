public class First100EvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 100) {
            System.out.println(number);
            number += 2; // Move to the next even number
            count++;
        }
    }
}
