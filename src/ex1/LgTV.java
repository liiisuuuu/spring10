package ex1;
// 결합도(Coupling)
// 하나의 클래스가 다른 클래스와 얼마나 많이 연결되어있는지를 나타내는 표현
// 결합도 높으면 유지보수, 관리 어려움

public class LgTV implements TV {
	// property를 등록 (msg, msg setter)
	private String msg;
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void powerOn() {
		System.out.println(msg + "LgTV---전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println(msg + "LgTV---전원 끈다.");
	}

	@Override
	public void volumnUp() {
		System.out.println(msg + "LgTV---볼륨을 올린다.");
	}

	@Override
	public void volumnDown() {
		System.out.println(msg + "LgTV---볼륨을 내린다.");
	}
}