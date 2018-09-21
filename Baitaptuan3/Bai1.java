package Baitaptuan3;

import java.util.Scanner;

public class Bai1 {
	Scanner sc = new Scanner(System.in);
	public void ucln()
	{
		
		System.out.println("Nhap a:");
		int a = sc.nextInt();
		System.out.println("Nhap b:");
		int b = sc.nextInt();
		while (b!=0)
		 {
		   int r=a%b;
		   a=b;
		   b=r;
		 }
		System.out.println("UCLN la: ");
		System.out.println(a);
	}
	public int fibo(int n)
	{
		//n = sc.nextInt();
		int f0=0;
		int f1=1;
		int fn=0;
		if(n<0)	return -1;
		else if(n==0||n==1) return n;
		else for(int i=0;i<n;i++)
		{
			f0=f1;
			f1=fn;
			fn=f0+f1;
		}return fn;
	}

	public static void main(String[] args) {
		Bai1 uc = new Bai1();
		uc.ucln();
		System.out.println("Nhap n: ");
		System.out.println("So fibo la: ");
		
		System.out.println(uc.fibo(8));
	}

}
