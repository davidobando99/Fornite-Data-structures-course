package mundo;

import collections.IQueue;
import collections.Queue;

public class Fornite{
	
	private Player player;
//	private Queue<Player> queue;
	private IQueue<Player> miQueue;

	public Fornite() {
		miQueue= new Queue<Player>();
	}



	
	public int size() {
		// TODO Auto-generated method stub
		return miQueue.size();
	}


	public static void main(String[] args) {
		Fornite f = new Fornite();
		System.out.println(f.size());
	
	}



	
	

}
