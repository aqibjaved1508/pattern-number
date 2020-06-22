import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String s="hello";
        System.out.println(removeDuplicates2(s));

    }
    public static String removeDuplicates2(String input)    // Time  ->  O(n)
                                                           // SPace  ->  O(n)
    {
        HashSet<Character> set = new HashSet<>();
        String output = "";
        for(int i = 0; i < input.length() ; i++)
        {
            char c = input.charAt(i);
            if(set.add(c))
            {
                output += c;
            }
        }
        return output;
    }
}