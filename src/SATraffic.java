
public class SATraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a=new SATraffic();
		a.redStop();
		a.yellowFlash();
		a.greenGo();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("yellowFlash implementation");
	}

}
