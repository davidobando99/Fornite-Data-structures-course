package collections;

public class Stack<S> implements IStack<S> {

	// **********************
	// Relations
	// **********************
	private Node<S> last;

	/**
	 * Constructor of this class.
	 */
	public Stack() {
		last = null;
	}

	@Override
	/**
	 * insert an element to the stack.
	 */
	public void push(S newElement) {

		Node<S> newElement2 = new Node<S>(newElement);
		if (last == null) {
			last = newElement2;
		} else {
			Node<S> actual = new Node<S>(newElement);
			while (actual.getNext() != null) {
				actual = actual.getNext();
			}
			actual.setNext(actual);
		}

	}

	@Override
	/**
	 * Remove first element of the stack.
	 */
	public void pop() {

		if (last == null) {
			last = null;
		} else if (last != null && last.getNext() == null) {
			last = null;
		} else {
			Node<S> actual = last.getNext();
			last = null;
			last = actual;
		}

	}

	@Override
	/**
	 * gets the first element in the stack.
	 */
	public S top() {
		return last.getValue();
	}

	@Override
	/**
	 * check if the stack is empty.
	 */
	public boolean isEmpty() {
		return (last == null) ? true : false;
	}

	@Override
	/**
	 * Analyze if exists an element given in the stack.
	 */
	public boolean search(S newElement) {
		Node<S> actual = last;
		boolean wasFound = false;

		while (actual != null) {
			if (actual.getValue() == newElement) {
				actual = last.getNext();
				wasFound = true;
			}
		}
		
		return wasFound;
	}

	@Override
	/**
	 * Returns the size of the stack.
	 */
	public int size() {
		int contador = 0; 
		Node<S> actual = last;
		
		while(actual != null) {
			contador++;
			actual = actual.getNext();
		}
		
		return contador;
	}

	// ************************
	// METHODS GET AND SETTERS
	// ************************

}
