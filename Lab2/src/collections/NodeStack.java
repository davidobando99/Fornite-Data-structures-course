package collections;

public class NodeStack<S> {

	//*********************
	// Relations
	//*********************
	private NodeStack<S> next;
	private S value;
	
	
	/**
	 * Constructor of this class.
	 */
	public NodeStack(S element) {
		value = element;
	}

	//*************************
	// METHODS GETS AND SETTERS
	//*************************
	
	public NodeStack<S> getNext() {
		return next;
	}


	public void setNext(NodeStack<S> next) {
		this.next = next;
	}


	public S getValue() {
		return value;
	}


	public void setValue(S value) {
		this.value = value;
	}
	
	

	
	

}
