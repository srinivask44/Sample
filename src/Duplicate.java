/*public class Duplicate {
}*/
public class Duplicate {
    public static void main(String[] args) {
        String str = "Hello, World!";
        findDuplicateCharacters(str);
    }
    public static void findDuplicateCharacters(String str) {

        char[] chars = str.toCharArray();
        int[] charCount = new int[256];
        for (char c : chars) {
            charCount[c]++;
        }
        System.out.println("Duplicate characters in the String \"" + str + "\" are:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " (count = " + charCount[i] + ")");
            }
        }
    }
}
