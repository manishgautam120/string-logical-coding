/*
43. Do right rotate by two for elements of given array?
*/
class Z17
{
	public static void main(String[] args) 
	{
		int[] x = {3, 6, 1, 10, 4, 6, 9, 12, 8, 7, 30};
		//		   0  1  2   3  4  5  6   7  8  9, 10
		//		   30, 3, 6, 1, 10, 4, 6, 9, 12, 8, 7


		System.out.println("initial array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();		
		int temp1 = x[x.length - 1];
		int temp2 = x[x.length - 2];
		for(int i = x.length - 1; i > 1; i --)
		{
			x[i] = x[i - 2];
		}
		x[0] = temp2;
		x[1] = temp1;
		System.out.println("final array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
	}
}
