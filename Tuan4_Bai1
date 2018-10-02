package Tuan4;

public class Bai_1 {
	
	static double Bim;
	static int a;
	static int b;
	static int[] ar = new int[100];
	
	public static int min(int a,int b)
	{
		int Max;
		if(a>b) Max=a;
		else Max=b;
		return Max;
	}
	public static int Minarr(int ar[])
	{
		int minar = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(minar>ar[i]) minar=ar[i];
		}
		return minar;
	}
	public static void BIM(double a,double b)
	{
		Bim=(a/(b*b));
		System.out.printf("Gia tri BIM: %.2f \n", Bim);
		if(Bim<18.5) System.out.println("Thieu can");
		else if(18.5<Bim && Bim<23)  System.out.println("Binh thuong");
		else if(23<Bim && Bim<24.99)  System.out.println("Thua can");
		else System.out.print("Beo phi");
	}
	public static void main(String[] args) {

		System.out.println("Max: " +Bai_1.min(3,9));
		// ar = {1;2;3;4};
		//System.out.println("Min in Arr: " +Bai_1.Minarr(3,9,5));
		Bai_1.BIM(55,1.72);
		// System.out.println("BIM = " +Bim);
		
	}

}
