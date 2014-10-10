import java.util.Arrays;


public class MergeSort {
	/** 
     * 归并排序 
     * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列 
     * 时间复杂度为O(nlogn) 
     * 稳定排序方式 
     * @param nums 待排序数组 
     * @return 输出有序数组 
     */  
	public static void merge(int nums[],int low,int mid,int high){
		//merge a[low,mid] and a[mid+1,high]
		int i,j;
		int n1=mid-low+1;
		int n2=high-mid;
		int[] leftArray=new int[n1+1];
		int rightArray[]=new int[n2+1];
		for(i=0;i<n1;i++){
			leftArray[i]=nums[low+i];
		}
		for(j=0;j<n2;j++){
			rightArray[j]=nums[mid+1+j];
		}
		//数组最后放一个“哨兵”，一旦出现“哨兵”，它不可能是两个数里最小的，除非另一堆里也只剩下“哨兵”。
		//但是一旦发生制剩下两张“哨兵”时，说明两个数组中的所有非“哨兵”都已经放到nums[]里了
		leftArray[n1]=Integer.MAX_VALUE;
		rightArray[n2]=Integer.MAX_VALUE;
		i=0;
		j=0;
		for(int k=low;k<=high;k++){
			if(leftArray[i]<=rightArray[j]){
				nums[k]=leftArray[i];
				i++;
			}else{
				nums[k]=rightArray[j];
				j++;
			}
		}
	}
	
	public static int[] sort(int nums[], int low, int high){
		if(low<high){
			int mid=(low+high)/2;
			sort(nums,low,mid);
			sort(nums,mid+1,high);
			merge(nums,low,mid,high);
		}
		return nums;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={8, 3, 4, 6, 1, 7, 12, 34, 11, 2};
		MergeSort.sort(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums)); 
	}

}
