public class BuyAndSell {
    public static void main(String[] args) {

        int a[]={100,180,260,310,40,535,695};

        System.out.println(buyAndSell(a));

    }

    public static String buyAndSell(int []a){

        int buyDay=-1;
        int sellDay=-1;
        int maxProfit=0;

        for(int i=0;i<a.length-1;i++){

            for(int j=i+1;j<a.length;j++){

                int curretProfit = a[j]-a[i];

                if(curretProfit>maxProfit){
                    maxProfit=curretProfit;
                    buyDay=i+1;
                    sellDay=j+1;
                }
            }
        }
        if(maxProfit==0){
            return "No Profit";
        }else{

            return "Buy on - Day "+buyDay+" - Sell on - Day "+sellDay+" - Profit = "+maxProfit;
        }
    }
}
