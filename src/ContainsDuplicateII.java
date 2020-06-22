import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicateII(int []nums, int k){ // 1,2,3,1   0->1, 3->1  3-0= 3 true
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int current=nums[i];

            if(map.containsKey(current) && i-map.get(current)<=k){
                return true;
            }else{
                map.put(current,i);
            }
        }
        return false;
    }
}
