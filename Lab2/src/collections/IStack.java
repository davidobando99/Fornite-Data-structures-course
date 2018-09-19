package collections;

/**
 * This interface is designed for decoupling of our program.
 * @author Douglas
 *
 * @param <S>
 */
public interface IStack<S>{

	public void push(S newElement);
	public void pop();
	public S top(); 
	public boolean isEmpty();
	public S search(S newElement);
	public int size();
	
}
