package com.sunbeam;
public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, world!";
        
        // Create a StringBuilder object with the original string
        StringBuilder reversedString = new StringBuilder(original);
        
        // Use the built-in reverse() method
        reversedString.reverse();
        
        // Convert the StringBuilder back to a String
        String result = reversedString.toString();
        
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + result);
    }
}
