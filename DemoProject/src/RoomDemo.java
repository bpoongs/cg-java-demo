
public class RoomDemo {

	public static void main(String[] args) {
		
		int marks; // declared the variable marks of type int
		marks = 80; // assigned a value of 80 to marks variable.
		
		//int marks = 80; // initialized a variable marks of value 80.
		
		//Room r1; // declared a variable r1 of type Room
		//r1 = new Room(); // assigned a room object to r1 variable
		
		//Room r1 = new Room();
		
		// When a Room class is used ( Room r5;)
		// 1. The Room class is loaded from the secondary storage to the jre(primary storage) by the classloader
		// 2. Allocate memory for static variables
		// 3. the static blocks are called - to initialize multiple static variables
		
		// when a room object is created ( r5 = new Room(150, 120);)
		// 4. Allocate memory for instance ( non-static) variable
		// 5. constructor is called - to initialize instance variables

		// can a static method access a non-static member?  NO
		// can a non-static method access a static member? 
				
		
		// Room r6 = new Room(100, 80);
		Room r1 = new Room(200, 150);
		//r1.length = 200;
		//r1.breadth = 150;
		//r1.height = 120;
		
		int area = r1.calculateFloorArea();
		System.out.println("Floor area of r1: " + area);
		
		int cost = r1.calculatePaintingCost(2);
		System.out.println("Painting cost of r1: Rs." + cost);
		
		//r1.roomColor = "blue";
		r1.setRoomColor("blue");
		//r1.roomNo = 101;
		r1.setRoomNo(101);
		
		Room r2 = new Room(250, 120);
		
		
		//r1.height = 200;
		//Room.height = 200;
		Room.setHeight(200);
		System.out.println("r1 height:" + r1.getHeight());
		System.out.println("r2 height:" + r2.getHeight());
		System.out.println("room height:" + Room.getHeight());

		System.out.println("double height : " + Room.doubleHeight());
		
		Room r3 = new Room(300, 140, "blue");
		
		
		
	}

}
