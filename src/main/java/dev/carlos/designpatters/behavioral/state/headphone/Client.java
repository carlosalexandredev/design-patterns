package dev.carlos.designpatters.behavioral.state.headphone;

public class Client {

	public static void main(String[] args) {
		HeadPhone phone = new HeadPhone();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
		phone.onClick();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
	}
}
