package ex03generics;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(31)); // true
		System.out.println(queue.offer(3)); // true
		System.out.println(queue.peek()); // 31
		System.out.println(queue.poll()); // 31
		System.out.println(queue.poll()); // 3
		System.out.println(queue.peek()); // null

		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(31);
		stack.push(3);
		System.out.println(stack.peek()); // 3
		System.out.println(stack.poll()); // 3
		System.out.println(stack.poll()); // 31
		System.out.println(stack.peek()); // null

	}

}
