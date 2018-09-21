package Quanlysinhvien;
import java.util.Scanner;
public class Sinhvien extends Human{
	String maSV;
	String tenhocphan1, tenhocphan2;
	double diemmon1, diemmon2;
	double diemTB;
	public Scanner sc;
	public Sinhvien() {}
	public Sinhvien(String name, String from, int year, String maSV ) {
		super(name, from,year);
		this.maSV = maSV;
	}
	@Override
	public void nhapTT() {
		
		sc = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap ma sinh vien");
		maSV = sc.nextLine();
		System.out.println("Nhap ten mon 1: ");
		tenhocphan1 = sc.nextLine();
		System.out.println("Nhap ten mon 2: ");
		tenhocphan2 = sc.nextLine();
		System.out.println("Nhap Diem mon 1: ");
		diemmon1 = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Diem mon 2: ");
		diemmon2 = Integer.parseInt(sc.nextLine());
	}
	public void hienthiTT() {
		super.hienthiTT();
		System.out.println("Ma sinh vien"+this.maSV);
		
		System.out.println("Ten mon 1: "+this.tenhocphan1);
		
		System.out.println("Ten mon 2: "+this.tenhocphan2);
		
		System.out.println("Diem mon 1: "+this.diemmon1);
		
		System.out.println("Diem mon 2: "+this.diemmon2);
		System.out.println("Diem trung binh: "+this.diemTB);
		
	}
	public float tinhdiemTB()
	{
		diemTB=(diemmon1+diemmon2)/2;
		return (float) diemTB;
	}
}
