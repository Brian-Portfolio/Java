package eg1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] array = {2,32,383,55,8,9,1,100,1003};
		System.out.println("Contents of array : ");
		System.out.println(Arrays.toString(array));
		
		Reverse(array);//Task1
		
		DeletePos(array);//Task2
		
		MaxEvenOddNum(array);//Task3,Task4
		
		MaxMinNum(array);//Task5
		
		Palindrome(array);//Task6
		
	}
	
	public static void Reverse(int[] arr) {
		System.out.println("\nContents of Reverse Array : ");
		int[] Revarr = new int[arr.length];
		int count = 0;
		for (int i=arr.length-1;i>=0;i--) {
			Revarr[count] = arr[i];
			count++;
		}
		System.out.println(Arrays.toString(Revarr));
	}
	
	public static void DeletePos(int[] arr) {
		Scanner user = new Scanner(System.in);
		System.out.println("\nPlease enter an integer value: ");
		int value = user.nextInt(); 
		
		int temp =0;
		int[] Del = new int[arr.length];
		
		for(int i=0;i<=arr.length-1;i++) {
			if (arr[i] != value) {
				Del[i] = arr[i];
			}
			else {
				temp = arr[i];
			}
		}
		
		if (temp == value) {
			int delposition = 0;
			int result = Del.length;
			for (int j=0; j<Del.length;j++) {
				if (Del[j]==0){
					delposition = j;
					result--;
				}
			}
			if (delposition==Del.length-1) {
				System.out.println("\nPrinting content of Deleted number within the array : ");
				for (int l=0;l<result;l++) {
					System.out.print(Del[l] + " ");
				}
			}
			else {
				for (int z=delposition;z<=result-1;z++) {
					Del[z] = Del[z+1];
				}
				System.out.println("\nPrinting content of Deleted number within the array : ");
				for (int k=0;k<=result-1;k++) {
					System.out.print(Del[k] + " ");

				}
			}
	}
		else {
			System.out.println("\nPrinting content of Deleted number within the array : ");
			System.out.println(Arrays.toString(Del));
		}
	}
	
	public static void MaxEvenOddNum(int[] arr) {
		int[] Even = new int[arr.length];
		int[] Odd  = new int[arr.length];
		
		for (int j=0; j<arr.length;j++) {
			if (arr[j]%2==0) {
				Even[j] = arr[j];
				
			}
		}
		System.out.println("\n\nPrint Contents of Even Numbers within Array : ");
		for (int k=0;k<arr.length;k++) {
			if (Even[k]!=0) {
				System.out.print(Even[k] + " ");
			}
		}
		
		
		for (int i = 0;i<arr.length;i++) {
			if (arr[i]%2==1) {
				Odd[i] = arr[i];
			}
		}
		
		System.out.println("\n\nPrint Contents of Odd Numbers within Array : ");
		for(int l=0;l<arr.length;l++) {
			if (Odd[l]!=0) {
				System.out.print(Odd[l] + " ");
			}
		}
		
		
		int SumEven=0;
		for (int k =0; k<Even.length; k++) {
			SumEven = SumEven + Even[k];
		}
		
		int SumOdd=0;
		for (int l =0; l<Odd.length; l++) {
			SumOdd = SumOdd + Odd[l];
		}
		
		if (SumEven > SumOdd) {
			System.out.println("\n\nSum of Even Numbers is larger : " + SumEven);
		}
		else {
			System.out.println("\n\nSum of Odd Numbers is larger : " + SumOdd);
		}
	}
		
	public static void MaxMinNum(int[] arr) {
		
		int temp = 0;
		int temp2 = 0;
		int maxtemp = 0;
		for (int i=0;i<arr.length;i++) {
			temp = arr[i];
			if (temp > temp2) {
				maxtemp = temp;
			}
			temp2 = maxtemp;
		}
		System.out.println("\nMax Number is : " + maxtemp);	
	
		int num = 0;
		int mintemp = arr[0];
		for (int j=0;j<arr.length;j++) {
			num = arr[j];
			if (num < mintemp) {
				mintemp = num;
			}
		}
		System.out.println("\nMin Number is : " + mintemp);
	}
	
	public static void Palindrome(int[] arr) {
		String[] Result = new String[arr.length];
		String[] copyResult = new String[arr.length];
		
		for (int l=0;l<arr.length;l++) {
			Result[l] = String.valueOf(arr[l]);
		}
		
		boolean example = false;
		int x = 0;
		while( x <= Result.length-1 ) {
			
			int j = Result[x].length()-1;
			
			for (int i=0; i <= Result[x].length()/2; i++) {
					
					if (Result[x].charAt(i) == Result[x].charAt(j)) {
						example = true;
						j--;
					}
					else {
						example = false;
						break;
					}
					
			}
			if (example==true) {
				copyResult[x] = Result[x];
			}
			x++;
		}
		System.out.println("\n\nPrinting contents of Palindrome numbers within the array : ");
		for (int y=0;y<arr.length;y++) {
			if (copyResult[y] != null){
				System.out.print(copyResult[y] + " ");
			}
		}
		
	}	
		
}
