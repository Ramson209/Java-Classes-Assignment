package q6;

public class Room
{
private int roomno;
private String roomtype;
private Double roomarea;
private Boolean ACmachine;

public void setData(int rmno,String rmtype,Double rmarea,Boolean acmac) {
	roomno=rmno;
	roomtype=rmtype;
	roomarea=rmarea;
	ACmachine=acmac;
}
public void displayData()
{
	System.out.println("room no. is: "+ roomno);
	System.out.println("room type is: "+ roomtype);
	System.out.println("room area is: "+roomarea);
	System.out.println("Ac machine is:"+ACmachine);
	}
public static void main (String[]args)
{
	Room firstroom=new Room();
firstroom.setData(20, "Single", 100.0, true);
firstroom.displayData();
	}
}
