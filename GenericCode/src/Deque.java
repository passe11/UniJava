
public interface Deque <E> {
	
	int size();
	boolean isEmpty();
	E first();
	E last();
	void addFirst(E e);
	Void addLast(E e);
	E removefirst();
	E removeLast();
	

}
