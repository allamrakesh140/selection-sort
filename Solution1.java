import java.util.Scanner;
class Solution1 {
    public int[] selectionSort(int[] nums) {
        int n=nums.length;
     for(int i=0;i<n-1;i++)
     {
        int minindex=i;

       // Find the index of the smallest element in the rest of the array
       for(int j=i+1;j<n;j++)
       {
        if(nums[j]<nums[minindex])
           {
            minindex=j;
           }
       }

       //swapping
       int temp=nums[i];
       nums[i]=nums[minindex];
       nums[minindex]=temp;

     }
     return nums;


    }

    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      int [] nums=new int[n];
      for(int i=0;i<n;i++)
      { 
        nums[i]=sc.nextInt();
      }

      Solution sol=new Solution();
      int[] sorted=sol.selectionSort(nums);
     
      //printing the array elements in asked order
      for (int num : sorted) {
            System.out.print(num + " ");
        }

    }
}