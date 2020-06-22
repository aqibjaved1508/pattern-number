public class LongestCommonSubString {
    public static void main(String[] args) {

        String s1="zxabcdey";
        String s2="yzabcdexy";
        System.out.println(longestCommonSubString(s1,s2));

    }

    public static String longestCommonSubString(String s1, String s2){

        String s="";
        String temp="";
        int k;
        for(int i=0;i<s1.length();i++){

            
            k=i;

            for (int j=0;j<s2.length();j++){

                if(s1.charAt(i)==s2.charAt(j)){
                    while((k<s1.length() && j<s2.length()) && (s1.charAt(k)==s2.charAt(j))){
                        temp+=s1.charAt(k);
                        k++;
                        j++;
                    }
                }
                if(s.length()<temp.length()){
                    s=temp;
                }
                temp="";
            }
        }
        return s;
    }
}