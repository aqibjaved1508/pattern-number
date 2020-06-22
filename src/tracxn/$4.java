package tracxn;

public class $4 {
    public static void main(String[] args) {

        pattern4(4);

    }
    public static void pattern4(int rows){

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
