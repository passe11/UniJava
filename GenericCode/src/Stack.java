
public class Stack <E> implements StackFace
{
	private int size = 0;
	private int top = -1;
	
	private E[] stack;
	
	@SuppressWarnings("unchecked")
	public Stack (int size) {
		this.size = size;
		stack= (E[]) new Object[size];
			
	}
	
	void Push (E e) {
		if(top != size -1) {
		stack[top] = e;
		top ++;
		}else {
		System.out.print("stack full");	
		}
	
	}
	E Top() {
		return stack[top];
	}
	
	E Pop () {
		E e = stack[top];
		if(this.IsEmpty()==false) {
		top--;
		}else {
		System.out.print("IsEmpty");	
		}
		return e;
	}
	
	int Size() {
		return size;	
	}
	
	boolean IsEmpty () {
		
		return(top==-1);
	}
	
	
}
