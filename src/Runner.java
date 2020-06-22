public class Runner {
    public static void main(String[] args) {

        int a[]={10,15,22,26,30,31,36,39};

        int b[]=numbers(a,10,4);
        for(int x:b)
            System.out.print(x+" ");
    }

    public static int[] numbers(int a[],int num, int k){
        int temp=0;
        int count=0;
        int b[]=new int[k];
        int x=0;
        for(int i=0;i<a.length;i++){

            if(a[i]==num){
                temp=i;
            }
        }
        int left=temp-1;
        int right=temp+1;

        while((left>=0 && right<a.length) && count<k){

            if((num-a[left])<(a[right]-num)){

                b[x]=a[left];
                --left;

            }else if((num-a[left])>(a[right]-num)){
                b[x]=a[right];
                ++right;
            }
            ++x;
            ++count;
        }

        if((right!=temp)){
            for(int i=right;i<=b.length;i++) {
                b[x++] = a[right++];
            }
        }else if(left!=temp){
            for(int i=left;i>=0;i--) {
                b[x++] = a[left--];
            }
        }
       return b;
    }
}
