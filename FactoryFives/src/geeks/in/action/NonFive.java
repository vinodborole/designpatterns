package geeks.in.action;

import java.math.BigDecimal;

/**
 * Concrete object to be created from factory. This covers digit 2 and 3 with
 * multiplier always as 1.
 * 
 * @author manishdevraj
 * 
 */
public class NonFive extends Digit {
	private final int base;
	private int value;
	private final int multiplier = 1;

	public NonFive(int newBase) {
		this.base = newBase;
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
