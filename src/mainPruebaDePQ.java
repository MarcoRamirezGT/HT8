import java.util.PriorityQueue;



public class mainPruebaDePQ {
	
	public static void main(String[] args) {
		PriorityQueue<String> que = new PriorityQueue<String>();
		
		que.add("MARCO");
		que.offer("ALYSON");
		que.add("REBECA");
		que.offer("DANIEL");
		que.add("MARIO");
		que.offer("JOSE");
		que.add("JORDAN");
		que.add("FRANCISCO");
		
		System.out.println("Head ::"+que.peek());
		System.out.println("Head ::"+que.element());
		
		while(!que.isEmpty())
		{
			System.out.println(que.poll()+" ");
			
		}
		System.out.println("\n");
		
		que.add("MARCO");
		que.offer("ALYSON");
		que.add("REBECA");
		que.offer("DANIEL");
		que.add("MARIO");
		que.offer("JOSE");
		que.add("JORDAN");
		que.offer("FRANCISCO");
		
		while(!que.isEmpty()) {
			System.out.println(que);
			System.out.println("Removed ::"+que.remove());
			System.out.println(que);
			System.out.println();
		}
		System.out.println();
		
	}

}
