public class IPAddress {
    public static void main(String[] args) {

        System.out.println(defangIPaddr("1.1.1.1"));

    }
    public static String defangIPaddr(String address) { //1.1.1.1

        String s="";

        for(int i=0;i<address.length();i++){

            if(address.charAt(i)=='.'){
                s+="[.]";
            }else{

                s+=address.charAt(i);

            }
        }
        return s;
    }
}
