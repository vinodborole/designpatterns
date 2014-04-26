package geeks.in.action;

import java.math.BigDecimal;

/**
 * Factory implementation that provides ability to create digits hiding
 * complexity. It either creates digit object based on base, multiplier details
 * or merge 2 digits to create new digit object.
 * 
 * @author manishdevraj
 * 
 */
public class FiveFactory {

	/**
	 * Make Digit factory method
	 * 
	 * @param base
	 * @param multiplier
	 * @return
	 */
	public Digit makeDigits(int base, int multiplier) {
		Digit digit = null;
		if ((base == 2 || base == 3)) {
			digit = new NonFive(base);
		} else if (base == 5 && multiplier > 0) {
			digit = new Five(multiplier);
		}
		return digit;
	}

	/**
	 * Merge 2 digits to get new one
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public Digit mergeDigits(Digit d1, Digit d2) {
		Digit digit = null;
		if (d1 != null && d2 != null) {
			int val1 = d1.getValue();
			int val2 = d2.getValue();
			if (val1 == val2 && isFives(val1) && isFives(val2)) {
				int remainder = (val1 + val2) / Digit.FIVE;
				int multiplier = getInverseExponent(remainder);
				digit = new Five(multiplier);
			} else if (isNonFive(val1, val2)) {
				digit = new Five(0);
			}
		}
		return digit;
	}

	/**
	 * Get inverse exponent of remainder after diving it by FIVE
	 * 
	 * @param val
	 * @return
	 */
	private int getInverseExponent(int val) {
		double rem = new BigDecimal(val).doubleValue();
		double dBase = Math.log(new BigDecimal(Digit.TWO).doubleValue());
		double dRem = Math.log(rem);
		double result = dRem / dBase;
		return new BigDecimal(result).intValue();
	}

	/**
	 * Check if digit does not contain 2, 3 base value
	 * 
	 * @param val
	 * @return
	 */
	private boolean isFives(int val) {
		if (val == 2 || val == 3) {
			return false;
		}
		return true;
	}

	/**
	 * Check if digit contain 2, 3 base value
	 * 
	 * @param val
	 * @return
	 */
	private boolean isNonFive(int val1, int val2) {
		if (val1 == 2 && val2 == 3) {
			return true;
		} else if (val2 == 2 && val1 == 3) {
			return true;
		}
		return false;
	}
}
