package Dsa_Basics.review;
import java.util.*;
public class MoveZeroes {
    public void Move(int[] nums){
        int n=nums.length;
        int index=0;
        
        for(int i=0;i<n;i++){
            if(nums[i] !=0){
                nums[index]=nums[i];
                index++;
            }
        }
            while(index<n){
                nums[index]=0;
                index++;
            }
        }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the Array elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        MoveZeroes mz=new MoveZeroes();
        mz.Move(nums);
        
       System.out.println(Arrays.toString(nums));
        sc.close();
        
    }
    
}



