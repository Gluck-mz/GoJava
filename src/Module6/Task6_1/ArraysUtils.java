package Module6.Task6_1;

public class ArraysUtils {
    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int min(int array[]) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int max(int array[]) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void maxPositive(int array[]) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 && array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        if (maxValue < 0) {
            System.out.println("Selected array contains only negative values. Max positive value cannot be found");
        } else {
            System.out.println("Max positive value from array of integers is: " + maxValue);
        }
    }

    public static int multiplication(int array[]) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }

    public static int modulus(int array[]) {
        return array[0] % array[array.length - 1];
    }

    public static int secondLargest(int array[]) {
        int largest = array[0];
        int secondLargest = array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static int[] reverse(int[] array) {
        int temp;
        for (int i = 0; i < (array.length)/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void findEvenElements(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }

    public static void printOut(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
