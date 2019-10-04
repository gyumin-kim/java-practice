package com.gyumin.buttondialer;

public class Button {

	private ButtonListener buttonListener;

	public Button(final ButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}
}
