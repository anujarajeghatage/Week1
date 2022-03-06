package arraydemo;

public class multidimension {

	public static void main(String[] args) {
		int a[][]= {{2,3,4},{5,4,6},{8,9,5}};
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}

	}

}
