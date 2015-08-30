// Developers
// JESUS MANUEL HERNANDEZ ZOZAYA

import java.util.*;
class SelectionSort
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int entranceLine = Integer.parseInt(sc.nextLine());
		int arrUnsort[] = new int[entranceLine];

		for (int i = 0; i<arrUnsort.length; i++)
			arrUnsort[i]=sc.nextInt();

		System.out.println(selectionSort(arrUnsort, 0, arrUnsort.length-1,minorNumber(arrUnsort,0,0)));
	}

	public static int minorNumber(int arr[],int minorIndex, int otherIndex)
	{
		if (otherIndex == arr.length)
			return minorIndex;
		else
		{
			if (arr[minorIndex] <= arr[otherIndex])
				return minorNumber(arr,minorIndex, otherIndex+1);
			else
				return minorNumber(arr,minorIndex+1,otherIndex);
		}
	}

	public static String selectionSort(int arr[], int minoIndex, int greaterIndex, int newMinorIndex)
	{
		if(minoIndex== arr.length)
			return "";
		else
		{
			int temp = 0;
			temp= arr[minoIndex];
			arr[minoIndex]=arr[newMinorIndex];
			System.out.print(arr[minoIndex]+" ");
			arr[newMinorIndex]=temp;
			int[] littleArray= Arrays.copyOfRange(arr, minoIndex+1,arr.length);
			int upperIndex=littleArray.length-1;
			return selectionSort(littleArray, minoIndex, upperIndex, minorNumber(littleArray, 0, 0));	
		}		
		
	}
}

