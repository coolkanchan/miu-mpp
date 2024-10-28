
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,34,1,56,10};
		int arr2[] = new int[5];
		
		for(int i =arr.length-1, p=0; i>=0;i--,p++) {
			
			
			arr2[p]= arr[i];
			
			
		}
		for(int p : arr2) {
			System.out.println(p);
		}

	}

}
