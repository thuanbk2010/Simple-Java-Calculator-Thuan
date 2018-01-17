package java.study.SimpleJavaCaculator;

import static java.lang.Math.log10 ;
import static java.lang.Math.pow ;

public class SimpleJavaCaculator {
	public enum BiOperatorModes {
		normal, add, minus, multiply, divide, xpowofy
	}
	public enum MonoOperatorMode {
		square, squareRoot, oneDeviceBy, cos, sin, tan, log, rate	
	}
	
	private Double num1, num2 ;
	private BiOperatorModes  mode = BiOperatorModes.normal ;
	
	private Double calculateBiImpl() {
		if (mode == BiOperatorModes.normal) {
			return num2 ;
		}
		if (mode == BiOperatorModes.add) {
			return num1 + num2 ;
		}
		if (mode == BiOperatorModes.minus) {
			return num1 - num2 ;
		}
		if (mode == BiOperatorModes.multiply) {
			return num1 * num2 ;
		}
		if (mode == BiOperatorModes.divide) {
			return num1 /num2 ;
		}
		if (mode == BiOperatorModes.xpowofy) {
			return pow(num1 , num2) ;
		}
		
		// never reach
		throw new Error();		
	}
	
	public Double calculateBi (BiOperatorModes newMode , Double num) {
		if (mode == BiOperatorModes.normal) {
			num2 = num ;
			num1 = 0.0 ;
			mode = newMode ;
			return Double.NaN ;
		}
		else {
			mode = newMode ;
			num1 = calculateBiImpl() ;
			num2 = num ;
			return num1 ;
		}
	}
	
	public Double calculateEqual (Double num) {
		return calculateBi(BiOperatorModes.normal, num) ;
	}
	
	public Double reset() {
		num2 = 0.0 ;
		num1 = 0.0 ;
		mode = BiOperatorModes.normal ;
		return Double.NaN ;
	}
	
	public Double calculateMono(MonoOperatorMode  newMode , Double num) {
		if (newMode == MonoOperatorMode.square) {
			return  num * num ;
		}
		if (newMode == MonoOperatorMode.squareRoot) {
			return Math.sqrt(num) ;
		}
		if (newMode == MonoOperatorMode.oneDeviceBy) {
			return 1/num ;
		}
		if (newMode == MonoOperatorMode.cos) {
			return Math.cos(num) ;
		}
		if (newMode == MonoOperatorMode.sin) {
			return Math.sin(num) ;
		}
		if (newMode == MonoOperatorMode.tan) {
			return Math.tan(num) ;
		}
		if (newMode == MonoOperatorMode.log) {
			return log10(num) ;
		}
		if (newMode == MonoOperatorMode.rate) {
			return num/100 ;
		}
		
		// never reach
		throw new Error() ;
	}
	
}
