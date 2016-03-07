package 工厂模式_抽象工厂模式;

public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}
	
}
