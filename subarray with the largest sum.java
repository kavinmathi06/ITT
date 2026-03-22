// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(fintMaxSubArraySum(nums));
    }
    public static int fintMaxSubArraySum(int[] nums){
        if(nums==null || nums.length==0) return 0;
        int max=nums[0];
        int current=nums[0];
        for(int i=1;i<nums.length;i++){
            current=Math.max(nums[i],current+nums[i]);
            max=Math.max(max,current);
        }
        return max;
    }
}