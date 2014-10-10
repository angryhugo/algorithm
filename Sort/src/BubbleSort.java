import java.util.Arrays;


public class BubbleSort {
	/** 
     * 由于在排序过程中总是小数往前放，大数往后放，相当于气泡往上升，所以称作冒泡排序。 
     * 时间复杂度为O（n^2） 
     * 稳定排序方式 
     * @param nums 待排序数组 
     * @return 输出有序数组 
     */  
	public static void sort(int[] nums){
		int temp;
		boolean isChanged;//不加此标识符也可以，但这样可以在已排完序的情况下减少不必要的循环
		for(int i=0;i<nums.length;i++){
			isChanged=false;
			for(int j=0;j<nums.length-i-1;j++){
				if(nums[j]>nums[j+1]){
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					isChanged = true; 
				}
			}
			//若没有移动,说明序列已经有序,跳出循环 
            if (!isChanged) {  
                break;  
            }  
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1, 2, 3, 4, 5, 7, 6};//使用isChanged判断，此例可以从6*7/2=21次循环减少到11次
		BubbleSort.sort(nums);
		System.out.println(Arrays.toString(nums)); 
	}

}
