package ex1;

public class SamsungTV implements TV {
	
	private String msg;
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void powerOn() {
		System.out.println(msg+"SamsungTV---���� �Ҵ�.");
	}

	@Override
	public void powerOff() {
		System.out.println(msg+"SamsungTV---���� ����.");
	}

	@Override
	public void volumnUp() {
		System.out.println(msg+"SamsungTV---������ �ø���.");
	}

	@Override
	public void volumnDown() {
		System.out.println(msg+"SamsungTV---������ ������.");
	}
}