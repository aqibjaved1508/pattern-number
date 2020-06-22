import java.util.HashMap;

public class CountBallon {
    public static void main(String[] args) {

        String s="balloon";

        System.out.println(countBalloon(s));
    }
    public static int countBalloon(String s){

        HashMap<Character,Integer> hashMap=new HashMap<>();
        int counter=0;
        String s1="balloon";

        for(int i=0;i<s1.length();i++)
        {

            hashMap.put(s1.charAt(i),0);
        }
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(hashMap.containsKey(c))
                    hashMap.put(c,hashMap.get(c)+1);
            }
            abc:
            while(true)
            {
                for(int i=0;i<s1.length();i++)
                {
                    char c=s1.charAt(i);
                    if(hashMap.containsKey(c))
                    {
                        if(hashMap.get(c)==0)
                            break abc;
                        hashMap.put(c,hashMap.get(c)-1);
                    }
                }
                counter++;
            }
            return counter;

    }
}
