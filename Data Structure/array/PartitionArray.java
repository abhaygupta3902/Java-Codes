import java.util.Scanner;

class PartitionArray
{
	void partitionArray(int arr[],int x,int n)
	{
		int i=0,j=n-1,temp;
		while(i<j)
		{
			while(arr[i]<=x)
				i++;

			while(arr[j]>x)
				j--;
			if(i>j)
				break;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}	
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();//size of the array
		
		int arr[]= new int [size];//array declaration
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();//taking input for the array
		}
		
		System.out.println("Enter the Partition value:");
		int x = sc.nextInt(); //taking input for the partition value

		PartitionArray obj = new PartitionArray();//creatinf object of the PartitionArray class
		obj.partitionArray(arr,x,size);//calling the partiionArray method with arguments arr,size and x(partition value)
		
		System.out.println("Array after partition:");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
}