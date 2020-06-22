package tracxn;

public class Q7 {
    public static void main(String[] args) {
        print7(4);
    }
    public static void print7(int n) {
        int x=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2 == 1){
                x=1;
            }else{
                x=0;
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print(x);
                x = x==1?0:1;
            }
            System.out.println();
        }
    }
}
