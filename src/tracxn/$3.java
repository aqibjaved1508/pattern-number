package tracxn;

public class $3 {
    public static void main(String[] args) {
        patter3(5);

    }
    public static void patter3(int n)
    {

        int spaces = n;
        for(int i=0;i<n;i++)
        {
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            int number = 1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(number+" ");
                number = number*(i-j)/(j+1);
            }
            spaces--;
            System.out.println();
        }

    }
}
