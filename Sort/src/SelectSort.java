import java.util.Arrays;


public class SelectSort {
	/** 
     * ÿһ�˴Ӵ����������Ԫ����ѡ����С������󣩵�һ��Ԫ�أ�˳��������ź�������е���ǰ������󣩣�ֱ��ȫ�������������Ԫ�����ꡣ 
     * ѡ�����򣬷�Ϊ��ѡ����������ѡ������(����������)�������� ���㷨Ϊ��ѡ������  
     * ʱ�临�Ӷ�ΪO(n^2) 
     * ���ȶ�����ʽ 
     * @param nums ���������� 
     * @return ����������� 
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
