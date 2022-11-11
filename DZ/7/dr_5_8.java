package dr_7_1; 
import java.util.Scanner;
import java.lang.Math;

class Point { 
	double x;
	double y;
	String color = "white";
	public Point(double x, double y) { 
		this.x = x;
		this.y = y;
	}
	public void set_color(String new_color) {
		this.color = new_color;
	}
	@Override 
	public boolean equals(Object o) {
		if (getClass() != o.getClass()) return false; 
		Point second_point = (Point) o;
		return (second_point.x == this.x) & (second_point.y == this.y); 
	}
	@Override
	public int hashCode() { 
		int result = 0;
		result = (int)this.x + (int)this.y*31; 
	   return result;
	}
	@Override
    public String toString() { 
        return Double.toString(this.x) + ", "+ Double.toString(this.y); 
    }
	public double get_x() { 
		return this.x;
	}
	public double get_y() { 
		return this.y;
	}
	public void set_x(double new_x) { 
		this.x= new_x;
	}
	public void set_y(double new_y) {
		this.y= new_y;
	}
}
class Segment { 
	Point start;
	Point end;
	String color = "white";
	
	public Segment(Point one, Point two) { 
		this.start = one;
		this.end = two;
	}
	public void set_color(String new_color) {
		this.color = new_color;
	}
	@Override 
	public boolean equals(Object o) {
		if (getClass() != o.getClass()) return false; 
		Segment second_segm = (Segment) o;
		return ((second_segm.start == this.start) & (second_segm.end == this.end) | (second_segm.start == this.end) & (second_segm.end == this.start));
	}
	@Override
	public int hashCode() { 
		int result = 0;
		result = this.start.hashCode()*59 + this.start.hashCode()*59;
	   return result;
	}
	@Override
    public String toString() { 
        return "(" + start.toString() + "; "+ end.toString() + ")";
    }	
	public double get_length() { 
		double x1 = this.start.get_x();
		double y1 = this.start.get_y();
		double x2 = this.end.get_x();
		double y2 = this.end.get_y();
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	public double get_x_range() { 
		return Math.abs(this.start.get_x() - this.end.get_x());
	}
	public double get_y_range() { 
		return Math.abs(this.start.get_y() - this.end.get_y());
	}
	public void move_x(double range) { 
		this.start.set_x(this.start.get_x() + range);
		this.end.set_x(this.end.get_x() + range);
	}
	public void move_y(double range) {
		this.start.set_y(this.start.get_y() + range);
		this.end.set_y(this.end.get_y() + range);
	}
	public void expand(double coof) { 
		double x_range = get_x_range();
		double new_length_x = x_range*coof;  
		double change_val_x = (new_length_x - x_range)/2; 
		if (this.start.get_x() < this.end.get_x()) {
			this.start.set_x(this.start.get_x() - change_val_x);
			this.end.set_x(this.end.get_x() + change_val_x);
		}
		else {
			this.start.set_x(this.start.get_x() + change_val_x);
			this.end.set_x(this.end.get_x() - change_val_x);
		}
		double y_range = get_y_range();
		double new_length_y = y_range*coof;
		double change_val_y = (new_length_y - y_range)/2;
		if (this.start.get_y() < this.end.get_y()) {
			this.start.set_y(this.start.get_y() - change_val_y);
			this.end.set_y(this.end.get_y() + change_val_y);
		}
		else {
			this.start.set_y(this.start.get_y() + change_val_y);
			this.end.set_y(this.end.get_y() - change_val_y);
		}
	}
	public double get_centre_x() {
		double x1 = this.start.get_x();
		double x2 = this.end.get_x();
		return (x1 + x2)/2;
	}
	public double get_centre_y() {
		double y1 = this.start.get_y();
		double y2 = this.end.get_y();
		return (y1 + y2)/2;
	}
	public void rotate(double coof) {
		double x1 = this.start.get_x();
		double y1 = this.start.get_y();
		double x2 = this.end.get_x();
		double y2 = this.end.get_y();
		double centre_x = get_centre_x();
		double centre_y = get_centre_y();
		System.out.printf("centre %f %f\n", centre_x, centre_y);
		double new_x1 = (x1 - centre_x)*Math.cos(coof) - (y1 - centre_y)*Math.sin(coof) + centre_x;
		double new_y1 = (x1 - centre_x)*Math.sin(coof) + (y1 - centre_y)*Math.cos(coof) + centre_y;
		double new_x2 = (x2 - centre_x)*Math.cos(coof) - (y2 - centre_y)*Math.sin(coof) + centre_x;
		double new_y2 = (x2 - centre_x)*Math.sin(coof) + (y2 - centre_y)*Math.cos(coof) + centre_y;
		this.start.set_x(new_x1);
		this.start.set_y(new_y1);
		this.end.set_x(new_x2);
		this.end.set_y(new_y2);
	}
	public void rotate_around(double coof, Point to_rotate) {
		
		double x1 = this.start.get_x();
		double y1 = this.start.get_y();
		double x2 = this.end.get_x();
		double y2 = this.end.get_y();
		double centre_x = to_rotate.get_x();
		double centre_y = to_rotate.get_y();
		System.out.printf("centre %f %f\n", centre_x, centre_y);
		double new_x1 = (x1 - centre_x)*Math.cos(coof) - (y1 - centre_y)*Math.sin(coof) + centre_x;
		double new_y1 = (x1 - centre_x)*Math.sin(coof) + (y1 - centre_y)*Math.cos(coof) + centre_y;
		double new_x2 = (x2 - centre_x)*Math.cos(coof) - (y2 - centre_y)*Math.sin(coof) + centre_x;
		double new_y2 = (x2 - centre_x)*Math.sin(coof) + (y2 - centre_y)*Math.cos(coof) + centre_y;
		this.start.set_x(new_x1);
		this.start.set_y(new_y1);
		this.end.set_x(new_x2);
		this.end.set_y(new_y2);
	}
}
class Square {
	
	Segment down;
	Segment left;
	String color = "white";
	Point centre;
	public Square(Segment down, Segment left) {
		this.down = down;
		this.left = left;
		if (down.start.equals(left.start) == false) {
			this.centre = new Point((down.start.get_x() + left.start.get_x())/2, (down.start.get_y() + left.start.get_y())/2);
		} else {
			this.centre = new Point((down.end.get_x() + left.end.get_x())/2, (down.end.get_y() + left.end.get_y())/2);
		}
		
	}
	public void set_color(String new_color) {
		this.color = new_color;
	}	
	@Override 
	public boolean equals(Object o) {
		if (getClass() != o.getClass()) return false; 
		Square second_sqr = (Square) o;
		return (second_sqr.down.equals(this.down) & second_sqr.left.equals(this.left) | (second_sqr.down.equals(this.left) & second_sqr.left.equals(this.down)));
	}
	@Override
	public int hashCode() {
		int result = 0;
		result = this.down.hashCode()*101 + this.left.hashCode()*101;
	   return result;
	}
	@Override
    public String toString() {
        return "Left: " + left.toString() + ", down "+ down.toString();
    }
	public void set_down_left(Segment new_down, Segment new_left) {
		if (new_down.get_length() == new_left.get_length()) {
			this.down = new_down;
			this.left = new_left;
			if (down.start.equals(left.start) == false) {
				this.centre = new Point((down.start.get_x() + left.start.get_x())/2, (down.start.get_y() + left.start.get_y())/2);
			} else {
				this.centre = new Point((down.end.get_x() + left.end.get_x())/2, (down.end.get_y() + left.end.get_y())/2);
			}
		}
	}
	public void expand(double coof) {
		double old_length = this.down.get_length();
		this.down.expand(coof);
		this.left.expand(coof);
		double new_length = this.down.get_length();
		double change_val = (new_length - old_length)/2;
		this.down.move_y(-change_val);
		this.left.move_x(-change_val);
	}

	public void rotate(double coof) {
		this.down.rotate_around(coof, this.centre);
		this.left.rotate_around(coof, this.centre);
	}
}
public class dr_5_8 {

	public static void main(String[] args) {
		System.out.print("Segment test: ");
		System.out.print("Before: ");
		Point p1 = new Point(1, 1);
		Point p1_2 = new Point(1, 1);
		Point p1_3 = new Point(1, 1);
		Point p2 = new Point(2, 1);
		Point p3 = new Point(0, 0);
		Point p4 = new Point(1, 2);
		Segment s1 = new Segment(p1, p2);
		Segment s2 = new Segment(p1_2, p4);
		Segment s3 = new Segment(p1_3, p3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.print("After expand x2: ");
		s1.expand(2);
		s2.expand(2);
		s3.expand(2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.print("Before rotate 1: ");
		s3.expand(0.5);
		System.out.println(s3);
		System.out.print("After rotate 0,785: ");
		s3.rotate(0.785);
		System.out.println(s3);
		System.out.print("Square test: ");
		Point ps1 = new Point(1, 1);
		Point ps2 = new Point(2, 1);
		Point ps3 = new Point(1, 1);
		Point ps4 = new Point(1, 2);
		Segment s_dawn = new Segment(ps1, ps2);
		Segment s_left = new Segment(ps3, ps4);
		Square sqr = new Square(s_dawn, s_left);
		System.out.print("Before: ");
		System.out.println(sqr);
		System.out.print("After expand: ");
		sqr.expand(3);
		System.out.println(sqr);
		System.out.print("After rotate: ");
		sqr.rotate(0.785398);
		System.out.println(sqr);
		}

}
