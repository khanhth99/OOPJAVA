package Hello;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Output o = new Output();
		o.go();
	}
	@SuppressWarnings("unused")
	void go()
	{
		int y=7;
		for(int x=1;x<8;x++)
		{
			x++;
			if(x<4) System.out.print(++y + " ");
			if(y>14) System.out.print(" x = " + x); break;
		}
		
	}

}
