package tracxn;

public class $8 {
    public static void main(String[] args) {

        pattern8(5);

    }

    public static void pattern8(int rows)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i; j++)
            {
                if(j%2==0)
                {
                    System.out.print(0);
                }else
                {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}