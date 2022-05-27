import java.util.*;
public class ArraySortingLinear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an Array Element");
		int SearchNumber;
		int FoundIndex =-1;
		int [] list = {52,45,12,9,58,79,63,01};
		SearchNumber = sc.nextInt();
		for(int i= 0; i<list.length;i++) {
		if(SearchNumber==list[i]) {
			FoundIndex= i;
			break;
		}}
		if(FoundIndex >=0) {
			System.out.println("Number Found"+ SearchNumber+ " "+"is:"+FoundIndex);
		}
		else {
			System.out.println("Number Found"+ SearchNumber+" "+"is not:"+FoundIndex);
		}

	}

}
