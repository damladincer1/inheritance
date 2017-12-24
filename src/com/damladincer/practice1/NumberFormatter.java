package com.damladincer.practice1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberFormatter {
	
	public static double format(double number, int scale) {
		BigDecimal bd = new BigDecimal(number);
		bd = bd.setScale(scale, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	public static float format(float number, int scale) {
		BigDecimal bd = new BigDecimal(number);
		bd = bd.setScale(scale, RoundingMode.HALF_UP);
		return bd.floatValue();
	}
}
