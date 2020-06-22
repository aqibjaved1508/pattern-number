public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        char c = 122;
        System.out.println(c);

    }

    public static String reverseOnlyLetters(String s){ //

        char []c=s.toCharArray();
        char ch='-';
        int i=ch;
        char temp;
        int left=0;
        int right=c.length-1;
        String s1="";
        while(left<=right){

            if(((c[left]>='A' && c[left] <='Z') || (c[left]>='a' && c[left]<='z'))
               && ((c[right]>='A' && c[right] <='Z') || (c[right]>='a' && c[right]<='z'))) {

                temp=c[right];
                c[right]=c[left];
                c[left]=temp;
                left++;
                right--;
            }else if((c[right] < 'A' || c[right] > 'Z') && (c[right] <'a' || c[right] >'z'))
                right--;
            else
                left++;
        }
        for(int j=0;j<c.length;j++){
            s1+=c[j];
        }
        return s1;
    }
}
