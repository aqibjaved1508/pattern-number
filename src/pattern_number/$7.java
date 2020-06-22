package tracxn;

public class $7 {
    public static void main(String[] args) {
        pattern(5);

    }

    public static void pattern(int rows)
    {
        int x=1;
        for(int i=1;i<=rows;i++)
        {
            if(i%2 == 1){
                x=1;
            }else{
                x=0;
            }
            for(int j=1;j<=rows;j++)
            {
                System.out.print(x);
                x = x==1?0:1;
            }
            System.out.println();
        }
    }
}
