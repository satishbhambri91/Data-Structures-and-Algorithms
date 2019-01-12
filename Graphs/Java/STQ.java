import java.util.*;
public class STQ{
	Stack<Integer> val = new Stack<Integer>();
	Stack<Integer> temp = new Stack<Integer>();

	public void Enqueue(int x){
		if(val.isEmpty()){
			val.push(x);
		}
		else{
			while(!val.isEmpty()){
				temp.push(val.pop());
			}
			val.push(x);
			while(!temp.isEmpty()){
				val.push(temp.pop());
			}
		}
	}
	public int Dequeue(){
		return val.pop();
	}

	public int peek(){
		return val.peek();
	}

	public boolean empty(){
		return val.isEmpty();
	}

	public static void main(String[] args){
		STQ queue = new STQ();
		queue.Enqueue(1);
		queue.Enqueue(5);
		queue.Enqueue(55);
		queue.Enqueue(23);

		while(queue != null)
		System.out.println(queue.Dequeue());
	}

}