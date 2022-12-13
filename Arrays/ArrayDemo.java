// 7. Print the common values


class ArrayDemo{

	public static void main(String arg[]){
		int A[] = {25,10,2,98,17,7};
		int B[] = {2,8,25,10};

		for(int x=0;x<A.length;x++){
			for(int y=0;y<B.length;y++){
				if(A[x] == B[y]){
					System.out.println(A[x]);
				}
			}
		}
		

		


	}

}