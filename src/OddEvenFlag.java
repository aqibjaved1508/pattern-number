public class OddEvenFlag {

    public static void main(String[] args) {
        System.out.println(oddEven("TRACXN",0));
    }
    public static String oddEven(String s, int flag){

        String result="";

        if(flag>1){
            return "Please give 0 and 1";
        }
        if(flag==1){

            for(int i=0;i<s.length();i+=2){

                result+=s.charAt(i);
            }
            return result;
        }else{

            for(int i=1;i<s.length();i+=2){

                result+=s.charAt(i);
            }
            return result;
        }
    }
}