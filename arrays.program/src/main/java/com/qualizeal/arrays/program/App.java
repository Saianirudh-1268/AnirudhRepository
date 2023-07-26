package com.qualizeal.arrays.program;
import com.qualizeal.array.operation.Array;
public class App {
    public static void main( String[] args){
    	Array arr = new Array();
    	   
    	int[] a = {1,2,6,8,0,0,4,4,9,2};
    	int[] b = {1,2,6,8,0,0,4,4,9,2};
    	
    	arr.compare(a,b);
    	arr.sorting(b);
    	arr.min(b);
    	arr.max(b);
    	arr.SecondMaxElement(b);
    	arr.reverse(a);
    	arr.duplicate(a);
    	arr.shiftleft(b);
    	arr.shiftright(b);
    }
}
