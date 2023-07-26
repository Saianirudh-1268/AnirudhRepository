package com.qualizeal.array.operation;
import java.util.Arrays;
public class Array {
	public void compare(int[] a, int[] b) {
		if (Arrays.equals(a,b)) {
			System.out.println("Arrays are equal.");
		}else {
			System.out.println("Arrays are not equal.");
		}
	}
	public void sorting(int[] b) {
		Arrays.sort(b);
		System.out.println("Sorted Array :"+Arrays.toString(b));
	}
	public void min(int[] b) {
		Arrays.sort(b);
		System.out.println("Minimum Element :"+b[0]);
	}
	public void max(int[] b) {
		Arrays.sort(b);
		System.out.println("Maximum Element :"+b[b.length-1]);
	}
	public void SecondMaxElement(int[] b) {
		Arrays.sort(b);
		System.out.println("Second Largest Element :"+b[b.length-2]);
	}
	public void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			int j = a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=j;
		}
		System.out.println("Reversed Array :"+Arrays.toString(a));
	}
	public void duplicate(int[] a) {
		System.out.print("Duplicates in Array :");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
	public void shiftleft(int[] b) {
		System.out.println("\nArray after shifting zero to left :");
		for(int i=0; i<b.length;i++) {
			if(b[i]==0) {
				System.out.print(b[i]+" ");
			}
		}
		for(int j=0;j<b.length;j++) {
			if(b[j]!=0) {
				System.out.print(b[j]+" ");

			}
		}
	}
	public void shiftright(int[] b) {
		System.out.println("\nArray after shifting zero to right :");
		for(int i=0; i<b.length;i++) {
			if(b[i]!=0) {
				System.out.print(b[i]+" ");
			}
		}
		for(int j=0;j<b.length;j++) {
			if(b[j]==0) {
				System.out.print(b[j]+" ");

			}
		}
	}
}
