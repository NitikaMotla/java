
public class MaxElement {

	public static void main(String[] args) {
		int arr[]= {12,45,78};
		int max;
		for(int i= 0; i<arr.length;i++) {
			max=0;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]= max;
					
				}
				System.out.println(arr[i]);
			}
		}

	}

}
