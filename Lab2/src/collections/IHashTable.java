package collections;

public interface IHashTable<K,V> {
	
	public void add(V newElement, K key);
	public void remove(K key);
	public void search(K key);
	public int size();
	public boolean isEmpty();
	public K getKey();
	public V getValue();
	public int getSlot(K key,int c1, int c2);
	
	

}
