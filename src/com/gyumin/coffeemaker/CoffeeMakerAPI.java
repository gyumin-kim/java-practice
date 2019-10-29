package com.gyumin.coffeemaker;

public interface CoffeeMakerAPI {

	/**
	 * 온열판 감지기의 상태를 반환한다.
	 * 주전자가 온열판 위에 있는지, 만약 있다면 커피가 주전자 안에 들어 있는지 감지한다.
	 */
	public int getWarmerPlateStatus();

	public static final int WARMER_EMPTY = 0;
	public static final int POT_EMPTY = 1;
	public static final int POT_NOT_EMPTY = 2;

	/**
	 * 끓이는 장치의 스위치 상태를 반환한다.
	 * 물 위에 뜬 형태이며, 끓이는 장치 안에 물이 반 잔 이상 있으면 끓이는 장치가 비어있지 않음을 감지한다.
	 */
	public int getBoilerStatus();

	public static final int BOILER_EMPTY = 0;
	public static final int BOILER_NOT_EMPTY = 1;

	/**
	 * '끓임(Brew)' 버튼의 상태를 반환한다.
	 * 끓임 버튼은 순간 방식의 스위치이며 자신의 상태를 기억하는 능력이 있다.
	 * 이 함수를 누를 때마다 자신이 기억하는 상태를 반환하며,
	 * 그와 동시에 자신의 상태를 BREW_BUTTON_NOT_PUSHED 상태로 다시 초기화한다.
	 *
	 * 따라서 이 함수의 polling 상태가 굉장히 길지라도,
	 * 끓임 버튼이 눌렸다는 사실을 감지할 수 있다.
	 */
	public int getBrewButtonStatus();

	public static final int BREW_BUTTON_PUSHED = 0;
	public static final int BREW_BUTTON_NOT_PUSHED = 1;

	/**
	 * 끓이는 장치의 가열기를 켜거나 끈다.
	 */
	public void setBoilerState(int boilerStatus);

	public static final int BOILER_ON = 0;
	public static final int BOILER_OFF = 1;

	/**
	 * 온열판의 가열기를 켜거나 끈다.
	 */
	public void setWarmerState(int warmerState);

	public static final int WARMER_ON = 0;
	public static final int WARMER_OFF = 1;

	/**
	 * 끓임 버튼의 알림 장치의 불을 켜거나 끈다.
	 * 커피 만드는 주기가 끝나면 알림 장치의 불이 켜져야 하고,
	 * 사용자가 끓임 버튼을 누르면 불이 꺼져야 한다.
	 */
	public void setIndicatorState(int indicatorState);

	public static final int INDICATOR_ON = 0;
	public static final int INDICATOR_OFF = 1;

	/**
	 * 압력 완화 밸브를 열거나 닫는다.
	 * 이 밸브가 닫혔으면 끓이는 장치의 증기 압력이 뜨거운 물을 커피 필터 위에 뿌린다.
	 * 이 밸브가 열리면, 끓이는 장치의 증기는 바깥으로 빠져나가므로 끓이는 장치의 물이 필터에 뿌려지지 않는다.
	 */
	public void setReliefValveState(int reliefValveState);

	public static final int VALVE_OPEN = 0;
	public static final int VALVE_CLOSED = 1;
}
