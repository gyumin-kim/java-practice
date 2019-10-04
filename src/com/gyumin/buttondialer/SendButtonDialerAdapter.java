package com.gyumin.buttondialer;

public class SendButtonDialerAdapter implements ButtonListener {

	private Dialer dialer;

	public SendButtonDialerAdapter(final Dialer dialer) {
		this.dialer = dialer;
	}

	@Override
	public void buttonPressed() {
		dialer.send();
	}
}
