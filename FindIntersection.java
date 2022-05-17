package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a1 = {3,2,11,4,6,7};
		int[] a2 = {1,2,8,4,9,7};
		int length1 = a1.length;
		int length2 = a2.length;
		for(int i=0; i<=length1-1; i++)
		{
			for(int j=0; j<=length2-1; j++)
			{
				if(a1[i] == a2[j])
				{
					System.out.println(a1[i]);
				}
			}
		}


	}

}
