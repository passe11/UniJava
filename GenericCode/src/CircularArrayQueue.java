
public class CircularArrayQueue<E> implements Queue <E> {

	private int size = 0;
	private int f=0;
	private E[] queue;
	
	@SuppressWarnings("unchecked")
	public CircularArrayQueue (int capacity) {
		this.queue = (E[])new Object[capacity]; 
		
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size==0);
	}

	@Override
	public void enqueue(E e) {
		if (size == queue.length) throw new IllegalStateException("Queue is full");
		int entre = (size+f)%(queue.length);
		queue[entre]= e;
		size ++;
	}

	@Override
	public E first() {
		return queue[f];
	}

	@Override
	public E dequeue() {
		if(isEmpty())return null;
		E sortie = queue[f];
		queue[f]= null;
		f = (f+1)%queue.length;
		size --;
		return sortie;
	}
	

}
