package com.coplexOperation34;

public class ComplexNumber {
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
	this.real = real;
	this.imaginary = imaginary;
	}
	
	public double getReal () {
		return this.real;
	}
	
	public double getImaginary() {
		return this.imaginary;
	}
	
	public void add(double real, double imaginary) {
		ComplexNumber number = new ComplexNumber(real, imaginary);
		this.real = this.real + number.getReal();
		this.imaginary = this.imaginary + number.getImaginary();
		
	}
	public void add(ComplexNumber num) {
		this.real = num.getReal() + this.real;
		this.imaginary = num.getImaginary()+ this.imaginary;
		
	}
	public void subtract(double real, double imaginary) {
		ComplexNumber number = new ComplexNumber(real, imaginary);
		this.real = this.real - number.getReal();
		this.imaginary = this.imaginary - number.getImaginary();
		
	}
	public void subtract(ComplexNumber num1) {
		this.real = this.real - num1.getReal();
		this.imaginary = this.imaginary - num1.getImaginary();
		
	}

}
