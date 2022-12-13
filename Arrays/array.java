public class array{
	public int tot;
	

	public float getAvg(int A[]){
		
		for(int i=0;i<A.length;i++){
			tot = tot +A[i];
		}

		float avg = tot / A.length;
		return avg;
	}

	public int getSum(int B[]){
		int sum = B[0] + B[1];
		return sum;
	}

	public int getLast(int A[]){
		return A[A.length-1];
	}

	public void swap(int arr[]){
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
	}

	public void Display(int ar[]){

		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String arg[]){
		int T[] = {80,25,40,7,64,89,20,31};
		int mark[] = {87,96,30,10,47,55,68,71,90};

		array ob = new array();
		
		ob.Display(mark);
		ob.swap(mark);
		System.out.println();
		ob.Display(mark);

		//int x = ob.getLast(T);
		System.out.println("\nAverage : "+ob.getAvg(T));
		

	}

}