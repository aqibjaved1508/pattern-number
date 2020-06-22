import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueCharachter {

    public static void main(String[] args) {

        System.out.println(firstUniqChar2("loveleetcode"));

    }
    public static int firstUniqChar(String s) {

        if(s.length()==1)
            return 0;

        abc:
        for(int i=0;i<s.length();i++){

            for(int j=0;j<s.length();j++){

                if(s.charAt(i)==s.charAt(j) && i!=j){

                    continue abc;
                }
            }
            return i;
        }
        return -1;
    }

    public static int firstUniqChar2(String s){
        HashMap<Character,Integer> map = new HashMap();
        char result = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,(map.get(c)+1));
            }else
            {
                map.put(c,1);
            }
        }
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(map.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}