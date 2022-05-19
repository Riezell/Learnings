package com.sumCalculator29;

public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;

	public double getFirstNumber () {
	return this.firstNumber;
	}
	public double getSecondNumber() {
		return this.secondNumber;
	}
	public double getAdditionResult() {
		return this.firstNumber + secondNumber;
	}
	public double getSubtractionResult() {
		return this.firstNumber - secondNumber;
	}
	public double getMultiplicationResult () {
		return this.firstNumber * secondNumber;
	}
	public double getDivisionResult() {
		
		if(secondNumber == 0 || firstNumber == 0) {
			return 0;
		}
		return firstNumber / secondNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
}
