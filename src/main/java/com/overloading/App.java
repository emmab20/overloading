package com.overloading;

public class App {
    public static void main(String[] args) {

        // Take in strings as input
        System.out.println("Take in strings as input");
        favourites("hello", "world", "!"); // Take 3 strings
        favourites("hello", "world", "!", "Goodbye!"); // Take 4 strings

        // Take an array as input
        System.out.println(" ");
        System.out.println("Take an array as input");
        String[] array1 = { "This", "is", "an", "array" };
        favourites(array1);

        // Take two arrays as input
        System.out.println(" ");
        System.out.println("Take two arrays as input");
        String[] array2 = { "This", "is", "an", "array" };
        String[] array3 = { "This", "is", "another", "array" };
        favourites(array2, array3);
    }

    public static void favourites(String item1, String item2, String item3) {
        String[] favourites = new String[] { item1, item2, item3 };

        for (String favourite : favourites) {
            System.out.println(favourite);
        }
    }

    public static void favourites(String item1, String item2, String item3, String item4) {
        String[] favourites = new String[] { item1, item2, item3, item4 };
        for (String favourite : favourites) {
            System.out.println(favourite);
        }
    }

    public static void favourites(String[] items) {
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void favourites(String[] items1, String[] items2) {
        for (String item : items1) {
            System.out.println(item);
        }
        for (String item : items2) {
            System.out.println(item);
        }
    }

}
