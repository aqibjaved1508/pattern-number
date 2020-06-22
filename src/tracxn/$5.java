package tracxn;

public class $5 {
    public static void main(String[] args) {

        pattern5(5);

    }
    public static void pattern5(int rows)
    {
        for(int i=rows;i>=1;i--)
        {
            for(int j = rows; j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
