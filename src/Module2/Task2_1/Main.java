package Module2.Task2_1;

public class Main {
    public static void main(String[] args) {
        int[] ints = {-13, 52, 33, -74, 50, 46, 77, -86, 39, 10};
        int[] negativeInts = {-13, -52, -33, -74, -50, -46, -77, -86, -39, -10}; //created for testing purposes
        double[] doubles = {-21.2, 24.2, -36.3, 74.5, -85.5, 66.6, 47.7, -98.8, 49.9, 10.1};
        double[] negativeDoubles = {-21.2, -24.2, -36.3, -74.5, -85.5, -66.6, -47.7, -98.8, -49.9, -10.1}; //created for testing purposes

        System.out.println("Length of ints array is " + ints.length);
        System.out.println("Lenght of doubles array is " + doubles.length);
        System.out.println("Sum of ints is: " + sum(ints));
        System.out.println("Sum of doubles is: " + sum(doubles));
        System.out.println("Min value from array of integers is: " + min(ints));
        System.out.println("Min value from array of doubles is: " + min(doubles));
        System.out.println("Max value from array of integers is: " + max(ints));
        System.out.println("Max value from array of doubles is: " + max(doubles));
        maxPositive(ints);
        maxPositive(doubles);
        maxPositive(negativeInts);
        maxPositive(negativeDoubles);
        System.out.println("Multiplication of all values from ints array equals to: " + multiplication(ints));
        System.out.println("Multiplication of all values from doubles array equals to: " + multiplication(doubles));
        System.out.println("Modulus for ints array equals to: " + modulus(ints));
        System.out.println("Modulus for doubles array equals to: " + modulus(doubles));
        System.out.println("Second largest from array of ints equals to: " + secondLargest(ints));
        System.out.println("Second largest from array of doubles equals to: " + secondLargest(doubles));
        System.out.println("Second largest from array of negative ints equals to: " + secondLargest(negativeInts));
        System.out.println("Second largest from array of negative doubles equals to: " + secondLargest(negativeDoubles));

    }

    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double sum(double array[]) {
        double sum = 0;
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

    public static double min(double array[]) {
        double minValue = array[0];
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

    public static double max(double array[]) {
        double maxValue = array[0];
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

    public static void maxPositive(double array[]) {
        double maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 && array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        if (maxValue < 0) {
            System.out.println("Selected array contains only negative values. Max positive value cannot be found");
        } else {
            System.out.println("Max positive value from array of doubles is: " + maxValue);
        }

    }

    public static int multiplication(int array[]) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }

    public static double multiplication(double array[]) {
        double result = array[0];
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }

    public static int modulus(int array[]) {
        return array[0] % array[array.length - 1];
    }

    public static double modulus(double array[]) {
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

    public static double secondLargest(double array[]) {
        double largest = array[0];
        double secondLargest = array[1];
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
}
