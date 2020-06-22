import java.util.*;
public class So {
    public static void main(String[] args) {
        //System.out.println("bat");
        sorted("bat");
    }
    public static void anagram(List<String> dictionary,List<String> query){
        List<Integer> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<dictionary.size();i++){
            dictionary.set(i,sorted(dictionary.get(i)));
        }
        for(int i=0;i<query.size();i++){

        }
    }
    public static String sorted(String s){
        char[] c = s.toCharArray();
        java.util.Arrays.sort(c);
        StringBuilder s1 = new StringBuilder();
        System.out.println(c);
        for(char ca:c)
            s1.append(ca);
        return s1.toString();
    }
}
