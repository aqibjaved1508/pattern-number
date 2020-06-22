public class AqibNagarro {

    public static void main(String[] args) {
       // System.out.println(lastDigit2(2,5));
        System.out.println(lastDigit(3,8));
        System.out.println(power(3,8));
//        int a[] = {2,2,2,1};
//        System.out.println(secondLargest(a));
    }

    public static int lastDigit(int input1, int input2){ // T -> O(N)
                                                         // S-> O(1)
        if(input2 == 0)
            return 1;
        int result = 1;
        for(int i=1;i<=input2;i++){
            result = (result*input1)%10;
        }
        return result;
    }

    public static int lastDigit2(int num, int pow){

        int temp=power(num,pow);
        return (temp%10);
    }

    private static int power(int num, int pow){  // T -> O(logn)   S -> O(1)

        if(pow==0)
            return 1;
        if(pow==1)
            return num;
        if(pow%2==0){

            return (power(num,pow/2)*power(num,pow/2))%10;
        }else{
            return (power(num,pow/2)*power(num,pow/2)*power(num,1))%10;
        }
    }

    public static int secondLargest(int a[]){
        if(a.length == 1)
            return -1;
        int n1 = a[0];
        int n2 = a[0];
        for(int i=1;i<a.length;i++){
            if(n1<a[i]){
                n1 = a[i];
            }
        }
        for(int i=1;i<a.length;i++){
            if(n2<a[i] && a[i]<n1){
                n2 = a[i];
            }
        }
        if(n1 == n2)
            return -1;
        return n2;
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