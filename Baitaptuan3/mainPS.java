package Baitaptuan3;

public class mainPS {

	public static void main(String[] args) {
		PS ps1 = new PS(2,4);
		PS ps2 = new PS(1,4);
		System.out.println(ps1.hienthi());
		System.out.println(ps1.UCLN(15,20));
		if(ps1.checktoigian()==true)
		{
		System.out.println(ps1.hienthi() + "Da toi gian");
		}else {
			System.out.println(ps1.hienthi() + " Chua toi gian");
		}
		ps1.toigianps();
		System.out.println(ps1.hienthi());
		PS ps3 = new PS(ps1,ps2,"+");
		System.out.printf("%s + %s = %s\n", ps1.hienthi(), ps2.hienthi(),ps3.hienthi());
		PS ps4 = new PS(ps1,ps2,"-");
		System.out.printf("%s - %s = %s\n", ps1.hienthi(), ps2.hienthi(),ps4.hienthi());
		PS ps5 = new PS(ps1,ps2,"*");
		System.out.printf("%s * %s = %s\n", ps1.hienthi(), ps2.hienthi(),ps5.hienthi());
		PS ps6 = new PS(ps1,ps2,"/");
		System.out.printf("%s : %s = %s\n", ps1.hienthi(), ps2.hienthi(),ps6.hienthi());
		
		
		PS ps7 = new PS();
		ps7.Equals(ps1, ps2);
		if(ps7.Equals(ps1, ps2)==true)
		{
			System.out.println("ps1 lon hon ps2");
		}else System.out.println("ps1 nho hon ps2");
		
		
	}

}
