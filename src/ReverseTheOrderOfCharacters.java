public class ReverseTheOrderOfCharacters {

    public static void main(String[] args) {

        String s="Let's take LeetCode contest";

        System.out.println(reverseTheOrderOfCharacters(s));

    }

    public static String reverseTheOrderOfCharacters(String s){

        String [] str=s.split(" ");
        String temp;

        String result="";
        for(int i=0;i<str.length;i++){

            temp=str[i];

            for (int j=temp.length()-1;j>=0;j--){

                result=result+temp.charAt(j);
            }

            result+=" ";
        }
        result=result.substring(0,result.length()-1);
        return result;


    }
}
