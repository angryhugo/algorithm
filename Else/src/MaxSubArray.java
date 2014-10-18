
public class MaxSubArray {
	
	public static class Data{
		private int left;
		private int right;
		private int sum;
		public Data(int left, int right, int sum){
			this.left = left;
			this.right = right;
			this.sum = sum;
		}
	}

	public static Data findMaxSubArray(int[] nums, int low, int high) {
		if(low == high){
			Data data=new Data(low, high, nums[low]);
			return data;
		}else{
			int mid=(low + high) / 2;
			Data leftData = findMaxSubArray(nums, low, mid);
			Data rightData = findMaxSubArray(nums, mid+1, high);
			Data crossData = findMaxCrossSubArray(nums, low, mid, high);
			if(leftData.sum >= rightData.sum && leftData.sum >= crossData.sum){
				return leftData;
			}else if(rightData.sum >= leftData.sum && rightData.sum >= crossData.sum){
				return rightData;
			}else{
				return crossData;
			}
		}		
	}
	

	private static Data findMaxCrossSubArray(int[] nums, int low, int mid,
			int high) {
		// TODO Auto-generated method stub
		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		int maxLeft = 0;
		int rightSum = Integer.MIN_VALUE;
		int maxRight = 0;
		for(int i = mid; i >= low; i--){
			sum += nums[i];
			if(sum > leftSum){
				leftSum = sum;
				maxLeft = i;
			}
		}
		sum = 0;
		for (int j = mid+1; j <= high; j++) {
			sum += nums[j];
			if (sum > rightSum) {
				rightSum = sum;
				maxRight = j;
			}
		}
		Data crossData = new Data(maxLeft, maxRight, leftSum + rightSum);
		return crossData;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		Data data = findMaxSubArray(nums, 0, 15);
		System.out.println("maximum=" + data.sum + " leftIndex=" + data.left + " rightIndex=" + data.right);

	}

}
