package Baitaptuan3;

public class PS {
	private int a;
	private int b;
	public PS(int a1, int a2)
	{
		this.a=a1;
		this.b=a2;
	}
	public String hienthi()
	{
		return this.geta() + "/" + this.getb();
	}
	public void seta(int a) {this.a=a; }
	public int geta() {return a;}
	public void setb(int b) {this.b=b; }
	public int getb() {return b;}
	public int UCLN(int x,int y)
	{
		int result = Math.min(x, y);
		while(result>=1)
		{
			if(x%result==0&&y%result==0) return result;
				result--;
		}return result;
	}
	public boolean checktoigian()
	{
		boolean check = false;
		int ucln =this.UCLN(this.geta(),this.getb());
		if(ucln==1) check=true;
		return check;
	}
	public void toigianps()
	{
		if(this.checktoigian()==false)
		{
		int ucln=this.UCLN(this.geta(), this.getb());
		this.seta(this.geta()/ucln);
		this.setb(this.getb()/ucln);
		}
	}
	public PS(PS ps1,PS ps2,String operator)
	{
		switch(operator)
		{
			case "+":
				this.cong(ps1, ps2); break;
			case "-":
				this.tru(ps1, ps2); break;
			case "*":
			case "x":
			case ".": 
				this.nhan(ps1, ps2); break;
			case ":":
			case "/":
				this.chia(ps1, ps2);
			default: break;
		}
	}
	public PS() {
		// TODO Auto-generated constructor stub
	}
	public void cong(PS ps1,PS ps2)
	{
		this.a=ps1.geta()*ps2.getb()+ps1.getb()*ps2.geta();
		this.b=ps1.getb()*ps2.getb();
		this.toigianps();
	}
	public void tru(PS ps1,PS ps2)
	{
		this.a=ps1.geta()*ps2.getb()-ps1.getb()*ps2.geta();
		this.b=ps1.getb()*ps2.getb();
		this.toigianps();
	}
	public void nhan(PS ps1,PS ps2)
	{
		this.a=ps1.geta()*ps2.geta();
		this.b=ps1.getb()*ps2.getb();
		this.toigianps();
	}
	public void chia(PS ps1,PS ps2)
	{
		this.a=ps1.geta()*ps2.getb();
		this.b=ps1.getb()*ps2.geta();
		this.toigianps();
	}
	public boolean Equals(PS ps1,PS ps2)
	{
		boolean test = false;
		ps1.seta(ps1.geta()*ps2.getb());
		//ps1.setb(ps1.getb()*ps2.getb());
		ps2.seta(ps2.geta()*ps1.getb());
		//ps2.setb(ps1.getb()*ps2.getb());
		if(ps1.geta()>ps2.geta())
		{
			test = true;
		}
		return test;
	}
}
