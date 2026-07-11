package OOPSone;

public class ComplexNumber {
	 int real;
	 int imaginary;

	public ComplexNumber(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	public int getReal() {
		return real;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	public int getImaginary() {
		return imaginary;
	}
	
	public void add(ComplexNumber c ) {
		this.real = this.real + c.real;
		this.imaginary = this.imaginary + c.imaginary;
//		this.real = real;
//		this.imaginary = imaginary;
	}
	public void multiply(ComplexNumber c) {
		int newreal = (this.real * c.real) - (this.imaginary * c.imaginary);
		int newimaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
		this.real = newreal;
		this.imaginary = newimaginary;
	}
	
	

	public void print() {
		System.out.println(this.real +"+i" + this.imaginary);
	}
	public static ComplexNumber add(int real,int imaginary) {
		return new ComplexNumber(real , imaginary);
	}
}
