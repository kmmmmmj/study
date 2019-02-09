package min;
import java.util.*;

public class Stack {
	private Object[] st;
	private int size;
	public Stack(int size_default){
		st = new Object[size_default];
		size = 0;
	}
	public void push(Object value){
		if(!isFull()){	
			st[size] = value;
			size++;
		}

	}
	public Object pop(){
		if(!isEmpty()){
			size--;
			Object temp = st[size];
			st[size] = null;
			return temp;
		}else{
			return -1;
		}
	}
	public int size(){
		return size;
	}
	public boolean isFull(){
		if(size == st.length)
			return true;
		else
			return false;
	}
	public boolean isEmpty(){
		if(size==0)
			return true;
		else
			return false;
	}
	public Object peek(){
		if(!isEmpty()){
			Object t = st[size-1];
			return t;
		}else{
			return -1;
		}
	}

}
