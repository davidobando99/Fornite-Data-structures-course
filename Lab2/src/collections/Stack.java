package collections;

public class Stack<S> implements IStack<S> {

	// **********************
	// Relations
	// **********************
	private NodeStack<S> last;

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

		NodeStack<S> newElement2 = new NodeStack<S>(newElement);
		if (last == null) {
			last = newElement2;
		} else {
			NodeStack<S> actual = last;
			if (last.getNext() == null) {
				last = newElement2;
				last.setNext(actual);
			} else {
				last = newElement2;
				last.setNext(actual);
			}
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
			NodeStack<S> actual = last.getNext();
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
		NodeStack<S> actual = last;
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
		int accountant = 0;
		NodeStack<S> actual = last;

		while (actual != null) {
			accountant++;
			actual = actual.getNext();
		}

		return accountant;
	}

	// ************************
	// METHODS GET AND SETTERS
	// ************************
	public NodeStack<S> getLast() {
		return last;
	}

	public void setLast(NodeStack<S> last) {
		this.last = last;
	}

}
