package arraydemo;

public class jaggedarr {

	public static void main(String[] args) {
		int arr[][]=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[1];
		arr[2]=new int[2];
		arr[3]=new int[2];
		arr[4]=new int[4];
		 int count=0;
		 for(i=0;i<arr.length;i++)
		 {
			 for(j=0;j<arr[i];j++)
			 {
				 arr[i][j]=count++;
			 }
		 }

	}

}
