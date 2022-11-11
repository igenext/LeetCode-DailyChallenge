class solution{

    static int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        for(int j=0;j<nums.length;j++) System.out.print(nums[j]+" ");
    }
}