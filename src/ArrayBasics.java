
public class ArrayBasics {
public void arraySum() {
	int[] nums = new int[4];
	nums[0]= 10;
	nums[1]= 20;
	nums[2]= 60;
	nums[3]= 70;
	for(int i =0; i<nums.length; i++) {
		System.out.println("["+i+"]--->"+ nums[i]);
	}
	int sum=0; 
	for(int j=0;j<nums.length;j++) {

	sum = sum+ nums[j];
	}
	System.out.println("Sum of All Arrays are :"+sum);
	}
public void averageOfArray() {
	int[] arr = new int[5];
	arr[0] = 15;
	arr[1] = 25;
	arr[2] = 10;
	arr[3] = 65;
	arr[4] = 20;
	int avg =0; int sum=0;
	for(int i =0; i<arr.length;i++) {
		sum = sum+arr[i];
		avg = sum/arr.length;
	}
	System.out.println("Average of Arrays are :"+ avg);
}
public void Max() {
	int [] arr1 = {25,58,6,98};
	int max ;
	for(int i=0; i<arr1.length;i++) {
		for(int j=i+1; j<arr1.length; j++) {
			if(arr1[i]>arr1[j]) {
				System.out.println(arr1[i]); 
			}else {
				System.out.println(arr1[j]);
			}
		}
	}
}
	public static void main(String[] args) {
		ArrayBasics arrayBasics = new ArrayBasics();
		arrayBasics.arraySum();
        arrayBasics.averageOfArray();
        arrayBasics.Max();
	}

}
