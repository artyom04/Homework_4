package TaskOne;

public class Main {
    //Implementation of Bubble Sort Algorithm

    public static void main(String[] args) {
        int[] arrayOne = {-25, 10, 0, -4, 78, 205, 1, 300, -6, 14, 3, 0};
        for (int i = 0; i < arrayOne.length - 1; i++) {
            boolean indicatorOfSwap = false;
            for (int j = 0; j < arrayOne.length - i - 1; j++) {
                if (arrayOne[j] > arrayOne[j + 1]) {
                    int temporaryNumber = arrayOne[j];
                    arrayOne[j] = arrayOne[j + 1];
                    arrayOne[j + 1] = temporaryNumber;
                    indicatorOfSwap = true;
                }
            }
            if (!indicatorOfSwap) {
                break;
            }
        }
        System.out.println("Array in ascending order:");
        for (int j : arrayOne) {
            System.out.print(j + " ");
        }

        System.out.println();

        int[] arrayTwo = {-41, 0, 14, 36, 258, 47, -56, 36, 0, 11};
        for (int i = 0; i < arrayTwo.length - 1; i++) {
            boolean indicatorOfSwap = false;
            for (int j = 0; j < arrayTwo.length - i - 1; j++) {
                if (arrayTwo[j] < arrayTwo[j + 1]) {
                    int temporaryNumber = arrayTwo[j];
                    arrayTwo[j] = arrayTwo[j + 1];
                    arrayTwo[j + 1] = temporaryNumber;
                    indicatorOfSwap = true;
                }
            }
            if (!indicatorOfSwap) {
                break;
            }
        }
        System.out.println("Array in descending order:");
        for (int j : arrayTwo) {
            System.out.print(j + " ");
        }
    }
}