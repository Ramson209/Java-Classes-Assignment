package q4;

import java.util.Scanner;

public class Area
{
int lenght;
int breadth;
Area(int l,int b){
	this.lenght=l;
	this.breadth=b;
}
public int area() {
	return lenght*breadth;
}
}
class Total{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int l,b;
		
		System.out.print("Enter Length : ");
		l=input.nextInt();
		
		System.out.print("Enter Breadth : ");
		b=input.nextInt();
		
		input.close();
		
		Area a=new Area(l,b);
		System.out.println("Area is : "+a.area());
	}
}
