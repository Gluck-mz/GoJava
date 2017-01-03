package Module7.Task7_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static List<String> stringArrayList = new ArrayList<>();
    private static List<String> stringLinkedList = new LinkedList<>();
    private static List<Integer> integerArrayList = new ArrayList<>();
    private static List<Integer> integerLinkedList = new LinkedList<>();

    public static void main(String[] args) {
        check1000IntegersArrayList();
        check1000IntegersLinkedList();
        check1000StringsArrayList();
        check1000StringsLinkedList();
        check10000IntegersArrayList();
        check10000IntegersLinkedList();
        check10000StringsArrayList();
        check10000StringsLinkedList();
    }

    public static void addInts(List list, int num) {
        Date startTime = new Date();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        Date currentTime = new Date();
        System.out.println("Timing for add(" + num + "): " + (currentTime.getTime() - startTime.getTime()));
    }

    public static void addStrings(List list, int num) {
        Date startTime = new Date();
        for (int i = 0; i < num; i++) {
            list.add("String" + i);
        }
        Date currentTime = new Date();
        System.out.println("Timing for add(" + num + "): " + (currentTime.getTime() - startTime.getTime()));
    }

    public static void timeOfGet(List list, int num) {
        Date startTime = new Date();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        Date currentTime = new Date();
        System.out.println("Timing for get(" + num + "): " + (currentTime.getTime() - startTime.getTime()));
    }

    public static void timeOfSet(List list, int num) {
        Date startTime = new Date();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, i + 1);
        }
        Date currentTime = new Date();
        System.out.println("Timing for set(" + num + "): " + (currentTime.getTime() - startTime.getTime()));
    }

    public static void timeOfRemove(List list, int num) {
        Date startTime = new Date();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        Date currentTime = new Date();
        System.out.println("Timing for remove(" + num + "): " + (currentTime.getTime() - startTime.getTime()));
    }

    public static void check1000IntegersArrayList() {
        System.out.println("1000 elements, Integers, ArrayList:");
        addInts(integerArrayList, 1000);
        timeOfSet(integerArrayList, 1000);
        timeOfGet(integerArrayList, 1000);
        timeOfRemove(integerArrayList, 1000);
    }

    public static void check1000IntegersLinkedList() {
        System.out.println("1000 elements, Integers, LinkedList:");
        addInts(integerLinkedList, 1000);
        timeOfSet(integerLinkedList, 1000);
        timeOfGet(integerLinkedList, 1000);
        timeOfRemove(integerLinkedList, 1000);
    }

    public static void check1000StringsArrayList() {
        System.out.println("1000 elements, Strings, ArrayList:");
        addStrings(stringArrayList, 1000);
        timeOfSet(stringArrayList, 1000);
        timeOfGet(stringArrayList, 1000);
        timeOfRemove(stringArrayList, 1000);
    }

    public static void check1000StringsLinkedList() {
        System.out.println("1000 elements, Strings, LinkedList:");
        addStrings(stringLinkedList, 1000);
        timeOfSet(stringLinkedList, 1000);
        timeOfGet(stringLinkedList, 1000);
        timeOfRemove(stringLinkedList, 1000);
    }

    public static void check10000IntegersArrayList() {
        System.out.println("10000 elements, Integers, ArrayList:");
        addInts(integerArrayList, 10000);
        timeOfSet(integerArrayList, 10000);
        timeOfGet(integerArrayList, 10000);
        timeOfRemove(integerArrayList, 10000);
    }

    public static void check10000IntegersLinkedList() {
        System.out.println("10000 elements, Integers, LinkedList:");
        addInts(integerLinkedList, 10000);
        timeOfSet(integerLinkedList, 10000);
        timeOfGet(integerLinkedList, 10000);
        timeOfRemove(integerLinkedList, 10000);
    }

    public static void check10000StringsArrayList() {
        System.out.println("10000 elements, Strings, ArrayList:");
        addStrings(stringArrayList, 10000);
        timeOfSet(stringArrayList, 10000);
        timeOfGet(stringArrayList, 10000);
        timeOfRemove(stringArrayList, 10000);
    }

    public static void check10000StringsLinkedList() {
        System.out.println("10000 elements, Strings, LinkedList:");
        addStrings(stringLinkedList, 10000);
        timeOfSet(stringLinkedList, 10000);
        timeOfGet(stringLinkedList, 10000);
        timeOfRemove(stringLinkedList, 10000);
    }
}
