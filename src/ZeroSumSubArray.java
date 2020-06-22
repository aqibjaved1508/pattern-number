public class ZeroSumSubArray {
    public static void main(String[] args) {

        int a[]={1,2,4,7,5,-1};

        System.out.println(zeroSumSubArray(a));


    }
    public static boolean zeroSumSubArray(int a[]){

        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==0){
                    return true;
                }
            }
        }
        return false;
    }
}
