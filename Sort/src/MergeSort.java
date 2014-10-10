import java.util.Arrays;


public class MergeSort {
	/** 
     * �鲢���� 
     * ���:�����������������ϣ������ϲ���һ���µ������ ���Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ������������ 
     * ʱ�临�Ӷ�ΪO(nlogn) 
     * �ȶ�����ʽ 
     * @param nums ���������� 
     * @return ����������� 
     */  
	public static void merge(int nums[],int low,int mid,int high){
		//merge a[low,mid] and a[mid+1,high]
		int i,j;
		int n1=mid-low+1;
		int n2=high-mid;
		int[] leftArray=new int[n1+1];
		int rightArray[]=new int[n2+1];
		for(i=0;i<n1;i++){
			leftArray[i]=nums[low+i];
		}
		for(j=0;j<n2;j++){
			rightArray[j]=nums[mid+1+j];
		}
		//��������һ�����ڱ�����һ�����֡��ڱ�������������������������С�ģ�������һ����Ҳֻʣ�¡��ڱ�����
		//����һ��������ʣ�����š��ڱ���ʱ��˵�����������е����зǡ��ڱ������Ѿ��ŵ�nums[]����
		leftArray[n1]=Integer.MAX_VALUE;
		rightArray[n2]=Integer.MAX_VALUE;
		i=0;
		j=0;
		for(int k=low;k<=high;k++){
			if(leftArray[i]<=rightArray[j]){
				nums[k]=leftArray[i];
				i++;
			}else{
				nums[k]=rightArray[j];
				j++;
			}
		}
	}
	
	public static int[] sort(int nums[], int low, int high){
		if(low<high){
			int mid=(low+high)/2;
			sort(nums,low,mid);
			sort(nums,mid+1,high);
			merge(nums,low,mid,high);
		}
		return nums;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={8, 3, 4, 6, 1, 7, 12, 34, 11, 2};
		MergeSort.sort(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums)); 
	}

}
