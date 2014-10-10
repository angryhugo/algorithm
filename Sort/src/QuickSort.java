import java.util.Arrays;


public class QuickSort {
	/** 
     * 1���ȴ�������ȡ��һ������Ϊ��׼���� 
     * 2���������̣���������������ȫ�ŵ������ұߣ�С�ڻ����������ȫ�ŵ�������ߡ� 
     * 3���ٶ����������ظ��ڶ�����ֱ��������ֻ��һ������ 
     * ʱ�临�Ӷ�ΪO(nlog n) 
     * ���ȶ�����ʽ 
     * @param nums ���������� 
     * @return ����������� 
     */  
    public static int[] sort(int[] nums,int low,int high) {  
        if (low<high) {  
            int mid = partition(nums,low, high);  
            //���  
            sort(nums,low, mid-1);  
            //�ұ�  
            sort(nums,mid+1, high);  
        }  
        return nums;  
    }  
      
    public static int partition(int[] nums,int low,int high){  
        int key = nums[low];//��׼��  
        int i =low;//��ָ��  
        int j = high;//��ָ��  
          
        if (low<high) {  
            while (i<j) {  
                //�����������Ϊ,��ָ������ ;���ұ߿�ʼ�ҵ�һ��С��key��ֵ
                while(i<j && nums[j]>=key) {  
                    j--;  
                }  
                  
                if (i<j) {  
                    nums[i] = nums[j];  
                    i++;  
                }  
                  
                //�����������Ϊ,��ָ������   ;����߿�ʼ�ҵ�һ������key��ֵ
                while(i<j && nums[i]<=key) {  
                    i++;  
                }  
                  
                if (i<j) {  
                    nums[j] = nums[i];  
                    j--;  
                }  
            }  
              
            //��key��������λ��,����׼��λ  
            nums[i] = key;  
        }  
        return i;  
    }  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={8, 3, 4, 6, 1, 7, 12, 34, 11, 2};
		QuickSort.sort(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums)); 
	}

}
