public class ReverseString {
    public static void main(String[] args) {

        String s="My name is khan";

        System.out.println(reverseString(s));

    }
    public static String reverseString(String str){

        String [] words=str.split(" ");
        String result="";
        for(int i=words.length-1;i>=0;i--){
            result=result+words[i]+" ";
        }
        result=result.substring(0,result.length()-1);
        return result;
    }
}