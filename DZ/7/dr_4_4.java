package dr_7_1;
import java.util.Scanner;

class Complex { 
	double real;
	double imaginary;
	
	public Complex(double real, double imaginary) { 
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex() {
		this.real = 0;
		this.imaginary = 0;		
	}
    @Override
    public String toString() 
    {
        return Double.toString(this.real)+" + "+Double.toString(this.imaginary)+"*i";
    }
    public void set_complex(double real, double imag) { 
		this.real = real;
		this.imaginary = imag;    	
    }
 	public void addComplex(Complex other_number) { 
		this.real += other_number.real;
		this.imaginary += other_number.imaginary;		
	}
	public void subComplex(Complex other_number) {
		this.real -= other_number.real;
		this.imaginary -= other_number.imaginary;		
	}
	public void mulComplex(Complex other_number) {
		double real_1 = this.real;
		double imaginary_1 = this.imaginary;
		double real_2 = other_number.real;
		double imaginary_2 = other_number.imaginary;
		this.real = real_1*real_2 - imaginary_1*imaginary_2;
		this.imaginary = imaginary_1*real_2 + real_1*imaginary_2;
	}
	public void divComplex(Complex other_number) {
		double real_1 = this.real;
		double imaginary_1 = this.imaginary;
		double real_2 = other_number.real;
		double imaginary_2 = other_number.imaginary;
		if (real_2 != 0 & imaginary_2 != 0) {
			this.real = (real_1*real_2 + imaginary_1*imaginary_2)/(real_2*real_2 + imaginary_2*imaginary_2);
			this.imaginary = (imaginary_1*real_2 - real_1*imaginary_2)/(real_2*real_2 + imaginary_2*imaginary_2);
		}
	}
	
}
class Fraction{ 
	Complex m;
	Complex n;
	
	public Fraction(Complex m, Complex n) {
		this.m = new Complex(m.real, m.imaginary);
		this.n = new Complex(n.real, n.imaginary);
	}
	public Fraction() {
		this.m = new Complex();
		this.n = new Complex();		
	}
    @Override
    public String toString() {
        return "(" + m.toString() +")/("+n.toString()+")";
    }
    public void set_frac(Complex m, Complex n) { 
		this.m = m;
		this.n = n;   	
    }
    public void addFrac(Fraction other) {
    	Complex n1 = new Complex(this.n.real, this.n.imaginary);
    	Complex m1 = new Complex(this.m.real, this.m.imaginary);
    	Complex m2 = new Complex(other.m.real, other.m.imaginary);
    	Complex n2 = new Complex(other.n.real, other.n.imaginary);
    	m1.mulComplex(n2);
    	m2.mulComplex(n1);
    	m1.addComplex(m2);
    	n1.mulComplex(n2);
    	this.n = n1;
    	this.m = m1;
    }
}


public class dr_4_4 {
	public static Fraction[] edit_array(Fraction[] array) { 
		int length = array.length;
		for (int i = 0; i < length-1; i++) {
			array[i].addFrac(array[i+1]);
		}
		return array;
	}
	public static void print_array(Fraction[] array) { 
		for (Fraction next: array) {
			System.out.println(next);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Complex m1 = new Complex(1, 0); 
		Complex n1 = new Complex(2, 0); 
		Fraction mn1 = new Fraction(m1, n1);
		Complex m2 = new Complex(1, 0);
		Complex n2 = new Complex(4, 0);
		Fraction mn2 = new Fraction(m2, n2);
		Complex m3 = new Complex(1, 0);
		Complex n3 = new Complex(5, 0);
		Fraction mn3 = new Fraction(m3, n3);
		Fraction[] array = {mn1, mn2, mn3};
		System.out.println("Before");
		print_array(array);
		edit_array(array);
		System.out.println("After");
		print_array(array);
		System.out.print("Input k: "); 
		int k = scanner.nextInt();
		double next_real, next_imag;
		Complex next_complex_m = new Complex();
		Complex next_complex_n = new Complex();
		Fraction[] array2 = new Fraction[k];
		for (int i = 0; i < k; i++) { 
			System.out.println("Next Fraction");
			System.out.println("m = complex; enter real part: ");
			next_real = scanner.nextDouble();
			System.out.println("Enter imaginary part: ");
			next_imag = scanner.nextDouble();
			next_complex_m.set_complex(next_real, next_imag);
			System.out.println("n = complex; enter real part: ");
			next_real = scanner.nextDouble();
			System.out.println("Enter imaginary part: ");
			next_imag = scanner.nextDouble();
			next_complex_n.set_complex(next_real, next_imag);
			array2[i] = new Fraction(next_complex_m, next_complex_n);
		}
		System.out.println("Before");
		print_array(array2);
		edit_array(array2);
		System.out.println("After");
		print_array(array2);
		scanner.close();
	}

}
