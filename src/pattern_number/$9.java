package tracxn;

public class $9 {
    public static void main(String[] args) {

        pattern9(4);

    }
    public static void pattern9(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1;i--)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int k=i; k<=n; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
