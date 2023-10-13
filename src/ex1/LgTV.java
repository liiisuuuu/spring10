package ex1;
// ���յ�(Coupling)
// �ϳ��� Ŭ������ �ٸ� Ŭ������ �󸶳� ���� ����Ǿ��ִ����� ��Ÿ���� ǥ��
// ���յ� ������ ��������, ���� �����

public class LgTV implements TV {
	// property�� ��� (msg, msg setter)
	private String msg;
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void powerOn() {
		System.out.println(msg + "LgTV---���� �Ҵ�.");
	}

	@Override
	public void powerOff() {
		System.out.println(msg + "LgTV---���� ����.");
	}

	@Override
	public void volumnUp() {
		System.out.println(msg + "LgTV---������ �ø���.");
	}

	@Override
	public void volumnDown() {
		System.out.println(msg + "LgTV---������ ������.");
	}
}