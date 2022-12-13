public class Bubble{

	public void BSort(int T[]){//p = 5 
		int p,N,c,temp;
		N = T.length-1;
		p = 1;

		while(p<T.length){
			c = 0;
			while(c<N){//controlling Number of checks
				if(T[c]>T[c+1]){
					temp = T[c];
					T[c] = T[c+1];
					T[c+1] =  temp;
				}
				c++;
			}
			p++;
			N--;
		}
	}

	public void Display(int T[]){

		for(int i=0;i<T.length;i++){
			System.out.print(T[i]+" ");
		}

	}

	public static void main(String abc[]){
		Bubble obj = new Bubble();
		int number[] = {100,35,48,102,2,20};

		obj.Display(number);
		obj.BSort(number);
		System.out.println();
		obj.Display(number);
		
	}

}