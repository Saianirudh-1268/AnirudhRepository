package com.qualizeal.matrix;
import com.qualizeal.matrix.program.Program;
public class Matrix {
	public static void main(String[] args) {
		Program p = new Program();
		
		int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] b = {{1,2,3},{1,2,3},{1,2,3}};
		
		p.Add(a,b);
		System.out.println("-------------------");
		p.Substract(a,b);
		System.out.println("-------------------");
		p.Multiply(a,b);
	}
}
