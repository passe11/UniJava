
interface List {

	/*
	 * Return the element at index i
	 */
	Block get(int i) throws IndexOutOfBoundsException;

	/*
	 * An ArrayList would usually be able to insert the block at any index. In this
	 * situation we add the block at the end of the Array.
	 */
	void add(Block h) throws IndexOutOfBoundsException;

	/*
	 * Return the number of blocks in Block Chain
	 */
	int size();

	/*
	 * Check to see if List is Empty,
	 */
	boolean isEmpty();
}
