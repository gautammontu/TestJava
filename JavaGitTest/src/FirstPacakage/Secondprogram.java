package FirstPacakage;

import Data_Stracture.DNode;

public class Secondprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("added new second program");

		
		System.out.println("Added new program");
		
		DNode head;
		DNode first;
		public DLinkList() {
			// TODO Auto-generated constructor stub
		
		head=null;
		}

		
		
		public void add(Object value){
			
			DNode newnode = new DNode(null,value,null);
			
			if(head==null){
				
				head=newnode;
				first=newnode;
			}else{
				
				newnode.next=head;
				head.previous=newnode;
				head=newnode;
				
			}
			
		
	}

	public void display(){
		
		DNode n = head;
		
		while(n!=null){
			
			System.out.println(n.value);
			n= n.next;
			
		}
	}

		public void displayprevious(){
			
			DNode n = head;
			DNode p= first;
			/*
			while(n!=null){
			
				
			System.out.println("basenode:"+n);	
			n= n.next;
			if(n!=null){
				p=n;
			}   
			
			System.out.println("previous:"+p);	
			} */
		
			
			while(p!=null){
				
				System.out.println(p.value);
				p= p.previous;
				
			}
			
		


	}

}
