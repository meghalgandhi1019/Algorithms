package hackerrank;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

public class MyStack {

	private int maxSize;
	private char[] stackArray;
	private int top;
	
	MyStack(int size){
		maxSize= size;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char input ){
		top ++;
		stackArray[top] = input;
		
	}
	
	public char pop(){
		
		if (isEmpty()){
			throw new NoSuchElementException("No elements - Underflow");
		}
		return stackArray[top--];
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		if (top == -1){
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		if(top == maxSize -1){
			return true;
		}
		return false;
	}
	
	public void increaseStackSize(){
		if(isFull()){
			maxSize = maxSize + maxSize/2 ;
			stackArray = Arrays.copyOf(stackArray, maxSize);
		}
	}
	
	public static boolean isBalanced(String input, int stackSize){
		
		MyStack stack = new MyStack(10);// Use this class implemented stack sturcture.
		//Stack<Character> stack = new Stack<Character>();// Use by default stack
		for(char chr : input.toCharArray()){
			if(chr == '{' || chr == '(' || chr == '['){
				stack.push(chr);
			}
			else if(chr == '}'){
				if( stack.isEmpty() || '{' != stack.pop()){
					
					return false;
				}
			}
			else if(chr == ')'){
				if( stack.isEmpty() || '(' != stack.pop()){
					
					return false;
				}
			}
			else if(chr == ']'){
				if( stack.isEmpty() || '[' != stack.pop()){
					
					return false;
				}
			}
		
	}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String input = "({[]}{}(((()))))";
		if (MyStack.isBalanced(input, input.length())){
			System.out.println(input + " balanced");
		}else{
			System.out.println(input + " Not balanced");
		}
		
		//Stack<Character> st = new Stack<Character>();

		

}
}