package co.demo.lab2;

public class StringMethodDemo {

    public static void testCharAt(String str) {
        System.out.println("charAt(2): " + str.charAt(2));
    }

    public static void testContains(String str, String search) {
        System.out.println("contains(\"" + search + "\"): " + str.contains(search));
    }

    public static void testLength(String str) {
        System.out.println("length(): " + str.length());
    }

    public static void testIndexOf(String str, String search) {
        System.out.println("indexOf(\"" + search + "\"): " + str.indexOf(search));
    }

    public static void testEquals(String str1, String str2) {
        System.out.println("\"" + str1 + "\".equals(\"" + str2 + "\"): " + str1.equals(str2));
    }

    public static void testEqualsIgnoreCase(String str1, String str2) {
        System.out.println("\"" + str1 + "\".equalsIgnoreCase(\"" + str2 + "\"): " + str1.equalsIgnoreCase(str2));
    }

    public static void testJoin(String delimiter, String... elements) {
        System.out.println("join(): " + String.join(delimiter, elements));
    }

    public static void testLastIndexOf(String str, String search) {
        System.out.println("lastIndexOf(\"" + search + "\"): " + str.lastIndexOf(search));
    }

    public static void testSubstring(String str, int start, int end) {
        System.out.println("substring(" + start + ", " + end + "): " + str.substring(start, end));
    }

    public static void testToLowerCase(String str) {
        System.out.println("toLowerCase(): " + str.toLowerCase());
    }

    public static void testToUpperCase(String str) {
        System.out.println("toUpperCase(): " + str.toUpperCase());
    }

    public static void testTrim(String str) {
        System.out.println("trim(): \"" + str.trim() + "\"");
    }

    public static void main(String[] args) {
        String example = "  Hello World!  ";

        System.out.println("Original String: \"" + example + "\"\n");

        testCharAt(example.trim());
        testContains(example, "World");
        testLength(example);
        testIndexOf(example, "l");
        testEquals("Test", "Test");
        testEqualsIgnoreCase("hello", "HELLO");
        testJoin("-", "Java", "is", "fun");
        testLastIndexOf(example, "l");
        testSubstring(example.trim(), 0, 5);
        testToLowerCase(example);
        testToUpperCase(example);
        testTrim(example);
    }
}
