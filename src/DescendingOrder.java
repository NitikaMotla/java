
public class DescendingOrder {

	public static void main(String[] args) {
		int arr[] = {36,45,2,17,96,48};
		for(int i =arr.length-1;i>=0; i--) {
			for (int j=arr.length-1; j>=0; j--) {
				if(arr[i]>arr[j]) {
					int swap = arr[j];
					arr[j]= arr[i];
					arr[i]= swap;
				}
				System.out.println(arr[j]);
			}
		}

	}

}
