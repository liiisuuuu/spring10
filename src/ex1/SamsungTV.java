package ex1;

public class SamsungTV implements TV {
	
	private String msg;
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void powerOn() {
		System.out.println(msg+"SamsungTV---전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println(msg+"SamsungTV---전원 끈다.");
	}

	@Override
	public void volumnUp() {
		System.out.println(msg+"SamsungTV---볼륨을 올린다.");
	}

	@Override
	public void volumnDown() {
		System.out.println(msg+"SamsungTV---볼륨을 내린다.");
	}
}