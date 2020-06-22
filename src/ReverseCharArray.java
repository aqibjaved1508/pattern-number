public class ReverseCharArray {
    public static void main(String[] args) {

        char c[]={'h','e','l','l','o'};

        reverseString(c);

    }
    public static void reverseString(char[] str) {

        int left=0;
        int right=str.length-1;
        char temp;

        while(left<right){
           temp= str[right];
           str[right]=str[left];
           str[left]=temp;
           left++;
           right--;
        }
        for(char ch:str)
            System.out.print(ch+" ");

    }
}
