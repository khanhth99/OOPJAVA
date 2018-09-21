package Quanlysinhvien;
import java.util.Scanner;
public class Human {
	String name;
	String from;
	int year;
	public Scanner sc;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Human(){}
	public Human(String ln, String dc, int yb)
	{
		name = ln;
		from =  dc;
		year = yb; 
	}
	public void nhapTT()
	{
		sc = new Scanner(System.in);
		System.out.println("Nhap Ho Ten: ");
		name = sc.nextLine();
		System.out.println("Nhap noi song : ");
		from = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		year =  Integer.parseInt(sc.nextLine());
	}
	public void hienthiTT()
	{
		System.out.println("Ho ten: "+ this.name);
		System.out.println("Dia chi: "+ this.from);
		System.out.print("Nam sinh: "+ this.year); 
	}
}