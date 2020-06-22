package tracxn;

public class $6 {
    public static void main(String[] args) {
        pattern6(5);

    }

    public static void pattern6(int rows)
    {
        for(int i=1; i<=rows; i++){
            for(int j=i; j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
