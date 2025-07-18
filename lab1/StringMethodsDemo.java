package co.demo.lab1;
public class StringMethodsDemo {

    public static void main(String[] args) {
        String sample = "Hello World";
        String another = "hello world";

        System.out.println("Original String: '" + sample + "'");

        // 1. charAt
        System.out.println("charAt(2): " + sample.charAt(2));

        // 2. contains
        System.out.println("contains(\"World\"): " + sample.contains("World"));

        // 3. length
        System.out.println("length(): " + sample.length());

        // 4. indexOf
        System.out.println("indexOf('o'): " + sample.indexOf('o'));

        // 5. equals
        System.out.println("equals(another): " + sample.equals(another));

        // 6. equalsIgnoreCase
        System.out.println("equalsIgnoreCase(another): " + sample.trim().equalsIgnoreCase(another));

        // 7. join
        String joined = String.join(" - ", "Java", "is", "fun");
        System.out.println("join(\" - \", \"Java\", \"is\", \"fun\"): " + joined);

        // 8. lastIndexOf
        System.out.println("lastIndexOf('l'): " + sample.lastIndexOf('l'));

        // 9. substring
        System.out.println("substring(2, 7): " + sample.substring(2, 7));

        // 10. toLowerCase
        System.out.println("toLowerCase(): " + sample.toLowerCase());

        // 11. toUpperCase
        System.out.println("toUpperCase(): " + sample.toUpperCase());

        // 12. trim
        System.out.println("trim(): '" + sample.trim() + "'");
    }
}
