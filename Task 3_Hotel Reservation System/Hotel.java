import java.util.*;

public class Hotel {
	
	private Room[] rooms;  //Room array is declared
	
	public Hotel(String hotelName, Room[] rooms) {
		this.rooms = rooms;
	}
	
	public void displayAvailableRooms() { // Display available rooms in the hotel
		System.out.println("Available rooms are : ");
		for(Room room : rooms) {
			if(!room.isOccupied()) {
				System.out.println(room );
			}
		}
	}
	
	public void checkIn() { //Check-in a guest to a room
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter room number : ");
		int roomNumber = sc.nextInt();
		Room room = findRoom(roomNumber);
		if(room!=null) {
			if(room.isOccupied()) {
				System.out.println("Room " + roomNumber + "is occupied");
			}
			else {
				System.out.println("Enter Guest details: \n");
				String guestName = sc.next();
				room.setGuestName(guestName);
				room.setOccupied(true);
				Date d1 = new Date();
				System.out.println("Room Booked succesfully..");
				System.out.println("Booking details : \nGuest Name: " + guestName + "\nRoom Number : " + roomNumber + "\nBooking Date " + d1 + "\n");
			}
		}
		else {
			System.out.println("Room number " + roomNumber + " does not exist");
		}
		
	}
	
	public void checkOut() { //Check-out of guest from room
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter room number : ");
		int roomNumber = sc.nextInt();
		Room room = findRoom(roomNumber);
		if(room!=null) {
			if(room.isOccupied()) {
				String guestName = room.getGuestName();
				room.setGuestName("");
				room.setOccupied(false);
				System.out.println("Guest " + guestName + " checked out from Room " + roomNumber);
			}
			else {
				System.out.println("Room number " + roomNumber + " is not occupied");
			}
		}
		else {
			System.out.println("Room number " + roomNumber + " does not exist");
		}
		
	}
	
	private Room findRoom(int roomNumber) { //findind a room by its number
		for(Room room : rooms) {
			if(room.getRoomNumber()==roomNumber){
				return room;
			}
		}
		return null;
	}
}
