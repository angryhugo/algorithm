import java.util.Arrays;


public class HeapSort {
	
	public static int leftNode(int i) {
		return 2 * i;
	}
	
	public static int rightNode(int i) {
		return 2 * i + 1;
	}
	
	public static int parentNode(int i) {
		return i / 2;
	}
	
	
	public static void maxHeapify(int[] nums, int i) {
		int left = leftNode(i);
		int right = rightNode(i);
		int largest = i;
		if( left < nums.length && nums[left] > nums[i] ){
			largest = left;
		}
		if ( right < nums.length && nums[right] > nums[largest]) {
			largest = right;
		}
		if (largest != i){
			int temp = nums[largest];
			nums[largest] = nums[i];
			nums[i] = temp;
			maxHeapify(nums, largest);
		}
	}
	
	public static void buildMaxHeap(int[] nums) {
		//字数组{length/2+1.。。n}都是叶结点，可看成只包含一个元素的堆。只需对非叶节点调用maxHeapify()即可。
		for(int i=nums.length /2; i >=0; i--){
			maxHeapify(nums, i);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={8, 3, 4, 6, 1, 7, 12, 34, 11, 2, 15, 19, 28};
		buildMaxHeap(nums);
		System.out.println(Arrays.toString(nums));
	}

}
