package geeks.in.action;

import java.math.BigDecimal;

/**
 * Concrete object to be created from factory. This covers digit 5 or 5 with
 * multiplier with value of 2^n (10, 20, 40, 80, 160, etc)
 * 
 * @author manishdevraj
 * 
 */
public class Five extends Digit {
	private final int base = FIVE;
	private int value;
	private final int multiplier;

	public Five(int multiplier) {
		this.multiplier = new BigDecimal(TWO).pow(multiplier).intValue();
	}

	@Override
	public int getValue() {
		int finalValue = new BigDecimal(base).multiply(
				new BigDecimal(multiplier)).intValue();
		setValue(finalValue);
		return value;
	}

	private void setValue(int finalValue) {
		this.value = finalValue;

	}

}
