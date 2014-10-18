import java.util.Arrays;


public class HeapSort {
	//������Ӧ��iΪ1, ���������е�i����ʾ��1��ʼ�ĸ����ֵ�����Զ�Ӧ������Ԫ����Ҫ-1
	public static int leftNode(int i) {
		return 2 * i;
	}
	
	public static int rightNode(int i) {
		return 2 * i + 1;
	}
	
	public static int parentNode(int i) {
		return i / 2;
	}
	
	public static int heapSize=0;
	
	public static void maxHeapify(int[] nums, int i) {
		int left = leftNode(i);
		int right = rightNode(i);
		int largest = i;
		if( left <= heapSize && nums[left-1] > nums[i-1] ){
			largest = left;
		}
		if ( right <= heapSize && nums[right-1] > nums[largest-1]) {
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
		//������{length/2+1.����n}����Ҷ��㣬�ɿ���ֻ����һ��Ԫ�صĶѡ�ֻ��Է�Ҷ�ڵ����maxHeapify()���ɡ�
		for(int i = nums.length /2; i >= 1; i--){
			maxHeapify(nums, i);
		}
		System.out.println("heap: "+Arrays.toString(nums));
	}
	
	public static void  sort(int[] nums) {
		//���������nums[len-1]������Ȼ��heap.size-1���ٵ���maxHeapify(nums,1)����һ���µ�����
		int temp = 0;
		heapSize = nums.length;
		buildMaxHeap(nums);
		for(int i = nums.length - 1; i > 0; i--){
			temp = nums[0];
			nums[0] = nums[i];
			nums[i] = temp;
			heapSize --;
			maxHeapify(nums, 1);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={8, 3, 4, 6, 1, 7, 12, 34, 11, 2, 15, 19, 28};
		sort(nums);
		System.out.println("sort: "+Arrays.toString(nums));
	}

}
