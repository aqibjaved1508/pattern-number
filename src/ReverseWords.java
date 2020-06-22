public class ReverseWords {

    public static void main(String[] args) {

        String s="My name is Khan";

        System.out.println(reverseWord(s));

    }
    private static String reverseWord(String inputString) {
        String[] words = inputString.split(" ");
        String outputString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            outputString = outputString + words[i] + " ";
        }

        return outputString;
    }
    }

