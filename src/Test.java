public class Test {
    public static void main(String[] args) {

        System.out.println(oddEvenCharacters("TRACXN",0));
        int a[]={100,180,260,310,40,535,695};
        System.out.println(buyAndSell(a));

        }
        public static String oddEvenCharacters(String s,int flag)
        {
            String result=" ";
            int i=flag==0?1:0;
                for(;i<s.length();i+=2)
                {
                    char c=s.charAt(i);
                    result+=c;
                }
            return result;
        }
        public static void printFizzBuzz()
        {
            for(int i=1;i<=100;i++)
            {
                if(i%15==0){
                    System.out.println("FizzBuzz");
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else if (i%3==0){
                    System.out.println("Fizz");
                }else{
                    System.out.println(i);
                }
            }
        }
        public static String buyAndSell(int a[])
        {

            int buyDay=-1;
            int sellDay=-1;
            int maxProfit=0;

            for(int i=0;i<a.length-1;i++){
                for (int j=i+1;j<a.length;j++){
                    int currentProfit=a[j]-a[i];
                    if(currentProfit>maxProfit){
                        maxProfit=currentProfit;
                        buyDay=i+1;
                        sellDay=j+1;
                    }
                }
            }
            if(maxProfit==0){

                return "No Profit";
            }else{

                return "Buy on - Day"+buyDay+" - Sell on - Day"+sellDay+" - Profit = "+maxProfit;
            }
        }
}