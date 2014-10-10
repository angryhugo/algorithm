import java.util.Arrays;


public class SelectSort {
	/** 
     * 每一趟从待排序的数据元素中选出最小（或最大）的一个元素，顺序放在已排好序的数列的最前（或最后），直到全部待排序的数据元素排完。 
     * 选择排序，分为简单选择排序、树形选择排序(锦标赛排序)、堆排序 此算法为简单选择排序  
     * 时间复杂度为O(n^2) 
     * 不稳定排序方式 
     * @param nums 待排序数组 
     * @return 输出有序数组 
     */
	public static void sort(int[] nums){
		int minIndex,temp;
		for(int i=0;i<nums.length;i++){
			minIndex=i;
			for(int j=i+1;j<nums.length;j++){
				if(nums[j]<nums[minIndex]){
					minIndex=j;
				}
			}
			if(minIndex != i){
				temp=nums[i];
				nums[i]=nums[minIndex];
				nums[minIndex]=temp;
			}
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={8, 3, 4, 6, 1, 7, 12, 34, 11, 2};
		SelectSort.sort(nums);
		System.out.println(Arrays.toString(nums)); 
	}

}
