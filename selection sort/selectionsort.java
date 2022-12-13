class selectionsort{

	public void Ssort(int A[]){
		int minV,temp,minIndex;
		
		for(int x=0;x<A.length;x++){
			minV = A[x];
			minIndex = x;
			for(int y=x;y<A.length;y++){
				if(A[y]<minV){
					minV = A[y];
					minIndex = y;
					
				}
			}
			temp = A[minIndex];
			A[minIndex] = A[x];
			A[x] = temp;
		}

	}

	public void Display(int T[]){
		for(int x=0;x<T.length;x++){
			System.out.print(T[x]+" ");
		}
	}

	public static void main(String arg[]){
		int num[] = {12,10,16,11,9,7};

		selectionsort ob = new selectionsort();
		ob.Display(num);
		ob.Ssort(num);
		System.out.println("after sorting....");
		ob.Display(num);

		
	}

}