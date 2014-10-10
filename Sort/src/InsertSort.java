import java.util.Arrays;


public class InsertSort {
	/** 
     * 插入排序
     * 时间复杂度为O(n^2) 
     * 稳定排序方式 
     * @param nums 待排序数组 
     * @return
     */  
	public static void sort(int a[]){
		int i,j,key;
		for(i=1;i<a.length;i++){
			key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={8, 3, 4, 6 ,1};
		InsertSort.sort(nums);
		System.out.println(Arrays.toString(nums)); 
	}

}
