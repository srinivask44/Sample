/*public class Duplicate {
}*/
//main class
public class Duplicate {
    //main method
    public static void main(String[] args) {
        String Drink = "water bottle";
        findDuplicateCharacters(Drink);
    }
    //method 1
    public static void findDuplicateCharacters(String Drink) {
//creating the sequence of characters
        char[] chars = Drink.toCharArray();
//used to count the array
        int[] charCount = new int[256];
        for (char c : chars) {
            charCount[c]++;
        }
        System.out.println("Duplicate characters in the String \"" + Drink + "\" is:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " (count = " + charCount[i] + ")");
            }
        }
    }
}
