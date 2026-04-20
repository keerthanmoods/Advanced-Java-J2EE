package string_Functions;

public class StringBuildingFunctions {

    // 1. Check if string is null or empty
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // 2. Count occurrences of substring
    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }
        return (mainString.length() - mainString.replace(subString, "").length()) / subString.length();
    }

    // 3. Reverse a string
    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // 4. Check palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // 5. Remove whitespace
    public static String removeWhitespace(String str) {
        return str == null ? null : str.replaceAll("\\s", "");
    }

    // 6. Capitalize words
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // 7. Truncate string
    public static String truncate(String str, int maxLength) {
        if (str == null) return null;
        return str.length() > maxLength ? str.substring(0, maxLength) + "..." : str;
    }

    // 8. Check numeric
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        return str.matches("\\d+");
    }

    // 9. Generate random string
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder random = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            random.append(chars.charAt(index));
        }
        return random.toString();
    }

    // 10. Count words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("1. Is Empty: " + isNullOrEmpty(""));

        System.out.println("2. Occurrences: " +
                countOccurrences("hello hello world", "hello"));

        System.out.println("3. Reverse: " +
                reverseString("hello"));

        System.out.println("4. Palindrome: " +
                isPalindrome("A man, a plan, a canal: Panama"));

        System.out.println("5. Remove Whitespace: " +
                removeWhitespace("Hello World"));

        System.out.println("6. Capitalize Words: " +
                capitalizeWords("hello world"));

        System.out.println("7. Truncate: " +
                truncate("Hello World", 5));

        System.out.println("8. Is Numeric: " +
                isNumeric("12345"));

        System.out.println("9. Random String: " +
                generateRandomString(10));

        System.out.println("10. Word Count: " +
                countWords("Hello world java"));
    }
}