import java.util.Scanner;

class AreaOfTriangle 
{
	public static void main(String[] args)
	{
		int base,height;
		float area=0.0f;
		System.out.println("Enter the values of base and height :");
		Scanner sc = new Scanner(System.in);
		base = sc.nextInt();
		height = sc.nextInt();
		area=(base*height)/2;
		System.out.println("the area of a triangle is "+area);
	}
}