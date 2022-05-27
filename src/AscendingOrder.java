import java.util.*;
public class AscendingOrder {

	public static void main(String[] args) {
   int array[] = {23,54,78,01,69,4};
   for(int i=0; i<array.length;i++) {
	   for(int j=i+1; j<array.length;j++) {
	   if(array[i]>array[j]) {
		   int swamp;
		   swamp = array[i];
		   array[i]= array[j];
		   array[j]= swamp;
		   
	   }
	   else
		   System.out.println();
	   }
	   System.out.print("Ascending Order is:");
	   
	  System.out.println(array[i]);
   }
  
   }
   

	}


