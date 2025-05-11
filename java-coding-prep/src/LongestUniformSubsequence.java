public class LongestUniformSubsequence {
    public static void findLongestUniformSubsequence(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }

        char maxChar = str.charAt(0);
        int maxLength = 1;

        char currentChar = str.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentLength++;
            } else {
                currentChar = str.charAt(i);
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxChar = currentChar;
            }
        }

        System.out.println("Longest uniform subsequence is: " +
                String.valueOf(maxChar).repeat(maxLength) +
                " (character: '" + maxChar + "', length: " + maxLength + ")");
    }

    public static void main(String[] args) {
        String input = "aaabbbbccddddddeee";
        findLongestUniformSubsequence(input);
    }

}
