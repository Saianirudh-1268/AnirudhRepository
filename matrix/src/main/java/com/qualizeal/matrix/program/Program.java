package com.qualizeal.matrix.program;
public class Program {
	public void Add(int[][] a, int[][] b) {
		int[][] c = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void Substract(int[][] a, int[][] b) {
		int[][] c = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void Multiply(int[][] a, int[][] b) {
		int[][] c = new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i][j]=0;
				for(int k=0;k<a.length;k++) {
					c[i][j] += a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
