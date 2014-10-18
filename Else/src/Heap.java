import java.util.Arrays;


public class Heap {
	//根结点对应的i为1, 代码中所有的i都表示从1开始的根结点值，所以对应的数组元素需要-1
	public static int leftNode(int i) {
		return 2 * i;
	}
	
	public static int rightNode(int i) {
		return 2 * i + 1;
	}
	
	public static int parentNode(int i) {
		return i / 2;
	}
	
	public static int heapSize4Building = 0;
	public static int heapSize = 0;
	
	public static void maxHeapify(int[] nums, int i) {
		int left = leftNode(i);
		int right = rightNode(i);
		int largest = i;
		if( left <= heapSize4Building && nums[left-1] > nums[i-1] ){
			largest = left;
		}
		if ( right <= heapSize4Building && nums[right-1] > nums[largest-1]) {
			largest = right;
		}
		if (largest != i){
			int temp = nums[largest-1];
			nums[largest-1] = nums[i-1];
			nums[i-1] = temp;
			maxHeapify(nums, largest);
		}
	}
	
	public static void buildMaxHeap(int[] nums) {
		//字数组{length/2+1.。。n}都是叶结点，可看成只包含一个元素的堆。只需对非叶节点调用maxHeapify()即可。
		for(int i=nums.length /2; i >= 1; i--){
			maxHeapify(nums, i);
		}
		System.out.println("heap: "+Arrays.toString(nums));
	}
	
	/** 
     * 优先队列 
     * heapExtractMax()：去掉并发挥S中具有最大关键字的元素
     * heapIncreaseKey(nums,i,key)：将元素i的关键字增加到key,key的值不小于i的原关键字
     * @param nums 待排序数组 
     * @return 输出有序数组 
     */  
	public static int heapExtractMax(int[] nums) {
		if(heapSize < 1){
			System.out.println("heap underflow");
			return Integer.MIN_VALUE;
		} else {
			int max = nums[0];
			nums[0] = nums[--heapSize];
			maxHeapify(nums, 0);
			return max;
		}
	}
	
	public static void heapIncreaseKey(int[] nums, int i, int key){
		if(key < nums[i-1]){
			System.out.println("new key is smaller than current key");
		} else {
			int temp = 0;
			nums[i-1] = key;
			System.out.println("eKey: "+Arrays.toString(nums));
			while(i > 1 && nums[parentNode(i)-1] < nums[i-1]){
				temp = nums[i-1];
				nums[i-1] = nums[parentNode(i)-1];
				nums[parentNode(i)-1] = temp;
				i = parentNode(i);
				System.out.println("ssss: "+Arrays.toString(nums));
			}
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={8, 3, 4, 6, 1, 7, 12, 34, 11, 2, 15, 19, 28};
		heapSize4Building = nums.length;
		buildMaxHeap(nums);
		
		heapIncreaseKey(nums, 5, 36);		
//		heapSize = nums.length;
//		heapExtractMax(nums);
//		System.out.println("heapExtractMax: "+Arrays.toString(nums));
	}

}
