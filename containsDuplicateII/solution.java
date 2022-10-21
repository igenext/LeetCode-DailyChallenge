import java.util.*;

class index{

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0 || nums.length==1) return false;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]) && Math.abs(i-mp.get(nums[i]))<=k) return true;
            mp.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3}, k=2;
        System.out.print(containsNearbyDuplicate(nums, k));
    }
}