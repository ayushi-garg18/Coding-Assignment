// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Random;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int randomIndex = random.nextInt(array.length);
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }

        System.out.println("The array after shuffling is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(+array[i] + " ");
        }
    }
}

