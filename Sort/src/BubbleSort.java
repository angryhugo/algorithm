import java.util.Arrays;


public class BubbleSort {
	/** 
     * �������������������С����ǰ�ţ���������ţ��൱�����������������Գ���ð������ 
     * ʱ�临�Ӷ�ΪO��n^2�� 
     * �ȶ�����ʽ 
     * @param nums ���������� 
     * @return ����������� 
     */  
	public static void sort(int[] nums){
		int temp;
		boolean isChanged;//���Ӵ˱�ʶ��Ҳ���ԣ��������������������������¼��ٲ���Ҫ��ѭ��
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
			//��û���ƶ�,˵�������Ѿ�����,����ѭ�� 
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
		int[] nums={1, 2, 3, 4, 5, 7, 6};//ʹ��isChanged�жϣ��������Դ�6*7/2=21��ѭ�����ٵ�11��
		BubbleSort.sort(nums);
		System.out.println(Arrays.toString(nums)); 
	}

}
