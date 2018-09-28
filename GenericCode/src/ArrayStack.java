
public class ArrayStack <E> implements Stack<E>
{
	private int size = 0;
	private int top = -1;
	private E[] stack;
	
	@SuppressWarnings("unchecked")
	public ArrayStack (int size) {
		this.size = size;
		this.stack= (E[]) new Object[size];
			
	}
	@Override
	public void Push (E e) {
		if(top != size -1) {
		stack[top] = e;
		top ++;
		}else {
		System.out.print("stack full");	
		}
	
	}
	@Override
	public E Top() {
		return stack[top];
	}
	@Override
	public E Pop () {
		E e = stack[top];
		if(this.IsEmpty()==false) {
		top--;
		}else {
		System.out.print("IsEmpty");	
		}
		return e;
	}
	@Override
	public int Size() {
		return size;	
	}
	@Override
	public boolean IsEmpty () {
		
		return(top==-1);
	}


	
}
