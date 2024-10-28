
public class MaxOrMin {
	
	public static int findoutMin(int arr[]) {
		int min = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
				
			}
		}
		
		return min;
		
	}
	
	public static int findoutMax(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,45,2,34,56,11};
		
		System.out.println("find out max value = "+ findoutMax(arr));
		System.out.println("find out min value = "+ findoutMin(arr));
		

	}

}
