package collections;

public interface IHashTable<K,V> {
	
	public void add(V newElement, K key);
	public void remove(V newElement,K key);
	public  HashNode<K,V> search(K key);
	public int size();
	public boolean isEmpty();
	public int getSlot(K key,int c1, int c2);
	
	

}
