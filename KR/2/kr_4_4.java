package kr_2;

public class kr_4_4 {
	public static double perimetr(double a, double b, double c){
        double p = a + b + c;
        return p;
    }

    public static double area(double a, double b, double c){
        double p = perimetr(a, b, c)/2;
        double s = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        return s;
    }

    public static void main(String[] args){
        double a = 3;
        double b=3.5 + a*Math.pow(2, -111);
        double c=b;
        System.out.println(perimetr(a, b, c));
        System.out.println(area(a, b, c));
    }
}
