/*
14. Find out the sum of all elements from a 
	second half of given int array?
*/
class N1
{
	public static void main(String[] args) 
	{
		int[] x = {3, 6, 1, 2, 4, 6, 9};
		// middle element is in the 2nd half
		int sum = 0;
		for(int i = (x.length / 2); i < x.length; i++)
		{
			sum += x[i];
		}
		System.out.println("sum:" + sum);
	}
}
