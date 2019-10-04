package com.gyumin.buttondialer;

public class Dialer {

	private Speaker speaker;
	private Screen screen;
	private Radio radio;

	public Dialer(final Speaker speaker, final Screen screen, final Radio radio) {
		this.speaker = speaker;
		this.screen = screen;
		this.radio = radio;
	}

	public void digit(int n) {
		screen.displayDigit(n);
		speaker.tone(n);
	}

	public void send() {
		radio.connect();
	}
}
