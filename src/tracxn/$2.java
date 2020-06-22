package tracxn;

public class $2 {
    public static void main(String[] args) {
        pattern();

    }
    public static void pattern()
    {
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<i+1;j++,k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
