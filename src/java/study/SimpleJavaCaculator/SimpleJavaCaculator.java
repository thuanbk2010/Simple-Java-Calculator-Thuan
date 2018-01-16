package java.study.SimpleJavaCaculator;

import static java.lang.Math.pow ;
import static java.lang.Math.log ;
import static java.lang.Math.log10 ;

public class SimpleJavaCaculator {
	public enum BiOperatorModes {
		normal, add, minus, multiple, divide, xpowofy
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
		if (mode == BiOperatorModes.multiple) {
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
			return sqrt (num) ;
		}
		if (newMode == MonoOperatorMode.oneDeviceBy) {
			return 1/num ;
		}
		if (newMode == MonoOperatorMode.cos) {
			return cos(num) ;
		}
		if (newMode == MonoOperatorMode.sin) {
			return sin(num) ;
		}
		if (newMode == MonoOperatorMode.tan) {
			return tan(num) ;
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
