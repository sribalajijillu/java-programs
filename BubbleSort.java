import java.util.*;
class BubbleSort {
	public static void main(String args[]) {
		int a[]={1,5,4,3,2};
		int temp,i;
		System.out.println("Before Bubble Sort");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for (i=0;i<a.length;i++) {
			for(int j=1;j<(a.length-i);j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Bubble Sort");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}