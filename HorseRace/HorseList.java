 import java.util.*;
	
class HorseList{

	HorseNode head,tail;

	public void init(){
		head = tail = null;
	}

	public void Register(int I,String hn,String jn){
		HorseNode h = new HorseNode();
		h.id = I;
		h.hname = hn;
		h.jname = jn;

		if(head == null){
			head = h;
			tail = h;
			tail.next = null;
		}else{
			tail.next = h;
			tail = h;
			tail.next = null;
			
		}
	}//end of register

	public void show(){
		HorseNode a = head;
		System.out.println("Horse ID	|	Horse Name	|	Jockey Name	|	round1	|	round 2		|	round3");
			
		while(a!=null){
			System.out.println("	|	"+a.id+"	|	"+a.hname+"	|	"+a.jname+"	|	"+a.r1rank+"	|	"+a.r2rank+"	|	"+a.r3rank);
			a = a.next;
		}
		
	}//end of show

	public void remove(int I){
		HorseNode a = head;
		HorseNode b = null;
		boolean found = false;
		
		while(a != null && found == false){
			if(a.id == I){
				found = true;
			}else{
				b = a;
				a = a.next;
				
			}

		}

		if(found == false ){
			System.out.println("Horse not found...");
		}else{
			System.out.println("Horse found...");
			System.out.println("Horse ID : "+a.id+"|Horse Name : "+a.hname+"|Jockey Name : "+a.jname);
			System.out.println("Are you sure(y/n)?");
			Scanner sc = new Scanner(System.in);
			String rep = sc.next();

			if(rep.equals("Y") || rep.equals("y")){
				if(b == null){
					head = head.next;
				}
				else{
					b.next = a.next;
				}
				System.out.println("Horse deleted successfully....");
			}	
		}

		
	}//end of delete

	public void round1(){

		System.out.println("Enter round 1 results.....");
		HorseNode p = head;
		Scanner ob = new Scanner(System.in);
		
		while(p != null){
			System.out.println("Enter round 1 result for Horse ID "+p.id);
			p.r1rank = ob.nextInt();
			p = p.next;
		}
	}//end of round 1

	public void round2(){
		System.out.println("Enter round 2 results.....");
		HorseNode p = head;
		Scanner ob = new Scanner(System.in);
		
		while(p != null){
			System.out.println("Enter round 2 result for Horse ID "+p.id);
			p.r2rank = ob.nextInt();
			p = p.next;
		}
	}//end of round 2

	public void round3(){
		System.out.println("Enter round 3 results.....");
		HorseNode p = head;
		Scanner ob = new Scanner(System.in);
		
		while(p != null){
			System.out.println("Enter round 3 result for Horse ID "+p.id);
			p.r3rank = ob.nextInt();
			p = p.next;
		}
	}//end of round 3

	public void removeround1(){
		HorseNode p,maxNode;
		int max;
		p = head;
		maxNode = head;
		max = maxNode.r1rank;
		
		while(p!=null){
			if(max<p.r1rank){
				maxNode = p;
				max = maxNode.r1rank;
			}else{
				p = p.next;
			}
		}//end while

		System.out.println("Removing lowest rank....");	
		delete(maxNode.id);	
	}//end of round 1

	public void removeround2(){
		HorseNode p,maxNode;
		int max;
		p = head;
		maxNode = head;
		max = maxNode.r2rank;
		
		while(p!=null){
			if(max<p.r2rank){
				maxNode = p;
				max = maxNode.r2rank;
			}else{
				p = p.next;
			}
		}//end while

		System.out.println("Removing lowest rank....");	
		delete(maxNode.id);	
	}//end of round 2

	public void removeround3(){
		HorseNode p,maxNode;
		int max;
		p = head;
		maxNode = head;
		max = maxNode.r3rank;
		
		while(p!=null){
			if(max<p.r3rank){
				maxNode = p;
				max = maxNode.r3rank;
			}else{
				p = p.next;
			}
		}//end while

		System.out.println("Removing lowest rank....");	
		delete(maxNode.id);	
	}//end of round 3



		

	public static void main(String arg[]){
		HorseList li = new HorseList();
		li.init();
		Scanner obj = new Scanner(System.in);
		int choice = 0;
		while(choice != 7){
		System.out.println("-------Horse Race 2022---------");
		System.out.println("...............................");
		System.out.println("1.Register Horse details");
		System.out.println("2.Display Participants");
		System.out.println("3.Delete a Horse");
		System.out.println("4.Insert round results");
		System.out.println("5.Winners");
		System.out.println("6.Search a horse");
		System.out.println("7.Exit");
		System.out.println("Please select your option..(1,2,3)?");
		choice = obj.nextInt();

		if(choice == 1){
			System.out.println("------Register a horse--------");
			System.out.print("Horse name : ");
			String hn = obj.next();
			System.out.print("Jockey name : ");
			String jn = obj.next();
			System.out.print("Horse ID : ");
			int id = obj.nextInt();

			li.Register(id,hn,jn);
		}//end choice 1

		if(choice == 2){
			System.out.println("-----------Horse details--------------");
			li.show();
		}//end choice 2

		if(choice == 3){
			System.out.println("-----------Deleting a horse--------------");
			System.out.println("Enter horse Id to be deleted..");
			int id = obj.nextInt();
			li.delete(id);
			
		}//end of choice 3
		
		if(choice == 4){
			li.round1();
			li.show();

			li.round2();
			li.show();

			li.round3();
			li.show();
		}//end of choice 4

		if(choice == 5){
			li.removeround1();
		}
		

		}//end while

		

	}


}