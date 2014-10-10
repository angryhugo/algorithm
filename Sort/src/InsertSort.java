import java.util.Arrays;


public class InsertSort {
	/** 
     * ��������
     * ʱ�临�Ӷ�ΪO(n^2) 
     * �ȶ�����ʽ 
     * @param nums ���������� 
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
