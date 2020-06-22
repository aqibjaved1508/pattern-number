public class SecondLargest {
    public static void main(String[] args) {

        int a[]={2,2,1};
        System.out.println(secondLargest(a));

    }

    public static int secondLargest(int a[]){


        if(a.length==1)           // 5 4 3 2 1
            return -1;

        int n1=a[0];
        int n2=a[1];
        if(n2>n1){
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        for(int i=2;i<a.length;i++){
            if(n1==n2 && a[i]<n1){

                n2=a[i];
            }else if(n2<a[i]){
                if(a[i]>n1){
                    n2=n1;
                    n1=a[i];
                }else if(a[i]<n1){
                    n2=a[i];
                }
            }
        }
        if(n1==n2){
            return -1;
        }
        return n2;

    }
}