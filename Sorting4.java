 
import java.util.Scanner;
public class Sorting4 {
          
	public static void swap(int arr[],int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static int partion(int arr[],int low,int high)
	{
		     int i=low-1;
		     int pivot=arr[high];
		     for(int j=low;j<high;j++)
		     {
		    	 if(arr[j]<pivot)
		    	 {
		    		 i++;
		    		 swap(arr,i,j);
		    	 }
		    	 
		    	 
		     }
		     swap(arr,i+1,high);
		     return (i+1);
	}
	
	public static void QuickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pi=partion(arr,low,high);
			
			QuickSort(arr,low,pi-1);
			QuickSort(arr,pi+1,high);
		}
	}
	public static void printarr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of the array");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		QuickSort(arr,0,n-1);
		printarr(arr);

	}

}
