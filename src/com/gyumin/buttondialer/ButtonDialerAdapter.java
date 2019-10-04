package com.gyumin.buttondialer;

public class ButtonDialerAdapter implements ButtonListener {

	private int digit;
	private Dialer dialer;

	public ButtonDialerAdapter(final int digit, final Dialer dialer) {
		this.digit = digit;
		this.dialer = dialer;
	}

	@Override
	public void buttonPressed() {
		System.out.println("button " + digit + "이 눌렸습니다.");
		dialer.digit(digit);
	}
}
