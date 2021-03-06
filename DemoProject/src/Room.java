
public class Room {
	
	private int length;
	private int breadth;
	private static int height;
	private int roomNo;
	private String roomColor;
	
	// static variables share a common memory
	// static variables dont belong to a particular
	// static variables can be access with the class name
	
	// constructors are special methods
	// they have the same name a that of the class
	// they do no return anything not even void
	// they are invoked automatically when the object is created
	
	static {
		height = 100;
	}
	
	Room(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		//this.height = height;
	}
	
	Room(int length, int breadth, String roomColor){
		this(length, breadth);
		//this.length = length;
		//this.breadth = breadth;
		this.roomColor = roomColor;
	}
	
	Room(int length, int breadth, String roomColor, int roomNo){
		this(length, breadth, roomColor);
		//this.length = length;
		//this.breadth = breadth;
		//this.roomColor = roomColor;
		this.roomNo = roomNo;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		Room.height = height;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomColor() {
		return roomColor;
	}

	public void setRoomColor(String roomColor) {
		this.roomColor = roomColor;
	}

	int calculateFloorArea() {
		int floorArea = 0;
		floorArea = length * breadth;
		return floorArea;
	}
	
	int calculatePaintingCost(int paintCost) {
		int paintingCost = 0;
		paintingCost = paintCost * (2 * height * (length + breadth));
		return paintingCost;
	}
	
	static int doubleHeight() {
		return 2 * height;
	}
}
