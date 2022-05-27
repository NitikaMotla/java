
public class InsertElement {

	public static void main(String[] args) {
		int arr[] = {20,10,18,11,15,9,14};
		int pos= 4;
		int element = 7;
		for(int i =arr.length-1; i>pos-1;i--) {
			arr[i]= arr[i-1];
		}
         arr[pos-1]= element;
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]+"  ");
	}
}
}