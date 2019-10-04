package com.gyumin.buttondialer;

public class Main {

	public static void main(String[] args) {
		Speaker speaker = new Speaker();
		Screen screen = new Screen();
		Radio radio = new Radio(screen);

		Dialer dialer = new Dialer(speaker, screen, radio);

		ButtonListener buttonDialerAdapter0 = new ButtonDialerAdapter(0, dialer);
		ButtonListener buttonDialerAdapter1 = new ButtonDialerAdapter(1, dialer);
		ButtonListener buttonDialerAdapter2 = new ButtonDialerAdapter(2, dialer);
		ButtonListener buttonDialerAdapter3 = new ButtonDialerAdapter(3, dialer);
		ButtonListener buttonDialerAdapter4 = new ButtonDialerAdapter(4, dialer);
		ButtonListener buttonDialerAdapter5 = new ButtonDialerAdapter(5, dialer);
		ButtonListener buttonDialerAdapter6 = new ButtonDialerAdapter(6, dialer);
		ButtonListener buttonDialerAdapter7 = new ButtonDialerAdapter(7, dialer);
		ButtonListener buttonDialerAdapter8 = new ButtonDialerAdapter(8, dialer);
		ButtonListener buttonDialerAdapter9 = new ButtonDialerAdapter(9, dialer);
		Button button0 = new Button(buttonDialerAdapter0);
		Button button1 = new Button(buttonDialerAdapter1);
		Button button2 = new Button(buttonDialerAdapter2);
		Button button3 = new Button(buttonDialerAdapter3);
		Button button4 = new Button(buttonDialerAdapter4);
		Button button5 = new Button(buttonDialerAdapter5);
		Button button6 = new Button(buttonDialerAdapter6);
		Button button7 = new Button(buttonDialerAdapter7);
		Button button8 = new Button(buttonDialerAdapter8);
		Button button9 = new Button(buttonDialerAdapter9);

		// 010 7192 1292
		buttonDialerAdapter0.buttonPressed();
		buttonDialerAdapter1.buttonPressed();
		buttonDialerAdapter0.buttonPressed();
		buttonDialerAdapter7.buttonPressed();
		buttonDialerAdapter1.buttonPressed();
		buttonDialerAdapter9.buttonPressed();
		buttonDialerAdapter2.buttonPressed();
		buttonDialerAdapter1.buttonPressed();
		buttonDialerAdapter2.buttonPressed();
		buttonDialerAdapter9.buttonPressed();
		buttonDialerAdapter2.buttonPressed();

		ButtonListener sendButtonDialerAdapter = new SendButtonDialerAdapter(dialer);
		sendButtonDialerAdapter.buttonPressed();
	}
}
