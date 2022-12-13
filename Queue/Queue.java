class Queue{

	int head,tail,count;

	public void init(int T[]){
		head = 0;
		tail = T.length-1;
		count = 0;
	}

	public int deq(int T[]){
		if(count == 0){
			System.out.println("Queue is empty...");
			return 0;
		}else{
			int item = T[head];
			T[head] = 0;
			head++;
			if(head>T.length-1){
				head = 0;
			}
			count--;
			if(count == 0){
				init(T);
			}
		return item;	
		}
	}

	public void enqu(int T[],int val){
		if(count == T.length){
			System.out.println("queue is full...");
		}
		else{
			tail++;
			if(tail>T.length-1){
				tail = 0;
			}
			T[tail] = val;
			count++;
		}
	}

	public void Display(int T[]){
		for(int x=0;x<T.length;x++){
			System.out.print(T[x]+" ");
		}

		System.out.print("\nHead : "+head+"	| Tail : "+tail+"	| count : "+count);
	}


	public static void main(String arg[]){
		int Q[] = new int[5];

		Queue obj = new Queue();

		obj.init(Q);
		obj.Display(Q);
		System.out.println("-----------------------------");
		obj.enqu(Q,50);
		obj.enqu(Q,60);
		obj.enqu(Q,70);
		obj.enqu(Q,80);
		obj.enqu(Q,90);
		
		obj.Display(Q);
		System.out.println("-----------------------------");
		obj.deq(Q);
		obj.deq(Q);
		obj.deq(Q);
		obj.deq(Q);
		obj.deq(Q);
		obj.Display(Q);
		
		

	}

}


