package tracxn.starpattern;

public class Q1 {
    public static void main(String[] args) {

        starPattern1(5);

    }

    public static void starPattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
