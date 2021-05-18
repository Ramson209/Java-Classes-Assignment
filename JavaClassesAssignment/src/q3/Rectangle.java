package q3;

public class Rectangle
{
int lenght;
int breadth;

Rectangle(int l,int b){
	this.lenght=l;
	this.breadth=b;
}
public int area() {
	return lenght*breadth;
}
static class Total{
	public static void main(String[]args) {
		Rectangle obj=new Rectangle(4,5);
		Rectangle obj1=new Rectangle(5,8);
		
		System.out.println(obj.area());
		System.out.println(obj1.area());
	}
}
}
